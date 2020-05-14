package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SurveyInnerAnswersPerEnvironment;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SurveyInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

public class SurveyInner   {
  @JsonProperty("questionVarName")
  private String questionVarName = null;

  @JsonProperty("AnswersPerEnvironment")
  @Valid
  private List<SurveyInnerAnswersPerEnvironment> answersPerEnvironment = null;

  public SurveyInner questionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
    return this;
  }

  /**
   * Get questionVarName
   * @return questionVarName
  **/
  @ApiModelProperty(example = "setting name", value = "")


  public String getQuestionVarName() {
    return questionVarName;
  }

  public void setQuestionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
  }

  public SurveyInner answersPerEnvironment(List<SurveyInnerAnswersPerEnvironment> answersPerEnvironment) {
    this.answersPerEnvironment = answersPerEnvironment;
    return this;
  }

  public SurveyInner addAnswersPerEnvironmentItem(SurveyInnerAnswersPerEnvironment answersPerEnvironmentItem) {
    if (this.answersPerEnvironment == null) {
      this.answersPerEnvironment = new ArrayList<SurveyInnerAnswersPerEnvironment>();
    }
    this.answersPerEnvironment.add(answersPerEnvironmentItem);
    return this;
  }

  /**
   * Get answersPerEnvironment
   * @return answersPerEnvironment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SurveyInnerAnswersPerEnvironment> getAnswersPerEnvironment() {
    return answersPerEnvironment;
  }

  public void setAnswersPerEnvironment(List<SurveyInnerAnswersPerEnvironment> answersPerEnvironment) {
    this.answersPerEnvironment = answersPerEnvironment;
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
        Objects.equals(this.answersPerEnvironment, surveyInner.answersPerEnvironment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionVarName, answersPerEnvironment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyInner {\n");
    
    sb.append("    questionVarName: ").append(toIndentedString(questionVarName)).append("\n");
    sb.append("    answersPerEnvironment: ").append(toIndentedString(answersPerEnvironment)).append("\n");
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

