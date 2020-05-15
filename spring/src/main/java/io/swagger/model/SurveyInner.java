package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Answer;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SurveyInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:22.170Z")

public class SurveyInner   {
  @JsonProperty("questionVarName")
  private String questionVarName = null;

  @JsonProperty("Answer")
  private Answer answer = null;

  public SurveyInner questionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
    return this;
  }

  /**
   * Question?
   * @return questionVarName
  **/
  @ApiModelProperty(example = "setting name", value = "Question?")


  public String getQuestionVarName() {
    return questionVarName;
  }

  public void setQuestionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
  }

  public SurveyInner answer(Answer answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyInner surveyInner = (SurveyInner) o;
    return Objects.equals(this.questionVarName, surveyInner.questionVarName) &&
        Objects.equals(this.answer, surveyInner.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionVarName, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyInner {\n");
    
    sb.append("    questionVarName: ").append(toIndentedString(questionVarName)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

