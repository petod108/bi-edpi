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
 * SurveyInnerAnswersPerEnvironment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

public class SurveyInnerAnswersPerEnvironment   {
  @JsonProperty("EnvironmentName")
  private String environmentName = null;

  @JsonProperty("Answer")
  private Answer answer = null;

  public SurveyInnerAnswersPerEnvironment environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * Get environmentName
   * @return environmentName
  **/
  @ApiModelProperty(value = "")


  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public SurveyInnerAnswersPerEnvironment answer(Answer answer) {
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
    SurveyInnerAnswersPerEnvironment surveyInnerAnswersPerEnvironment = (SurveyInnerAnswersPerEnvironment) o;
    return Objects.equals(this.environmentName, surveyInnerAnswersPerEnvironment.environmentName) &&
        Objects.equals(this.answer, surveyInnerAnswersPerEnvironment.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyInnerAnswersPerEnvironment {\n");
    
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
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

