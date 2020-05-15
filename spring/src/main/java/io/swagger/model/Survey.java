package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Survey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T17:21:26.661Z")

public class Survey   {
  @JsonProperty("questionVarName")
  private String questionVarName = null;

  @JsonProperty("AnswerList")
  @Valid
  private List<String> answerList = null;

  public Survey questionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
    return this;
  }

  /**
   * Question name which could have more answers
   * @return questionVarName
  **/
  @ApiModelProperty(example = "Which paths you want to select?", value = "Question name which could have more answers")


  public String getQuestionVarName() {
    return questionVarName;
  }

  public void setQuestionVarName(String questionVarName) {
    this.questionVarName = questionVarName;
  }

  public Survey answerList(List<String> answerList) {
    this.answerList = answerList;
    return this;
  }

  public Survey addAnswerListItem(String answerListItem) {
    if (this.answerList == null) {
      this.answerList = new ArrayList<String>();
    }
    this.answerList.add(answerListItem);
    return this;
  }

  /**
   * Get answerList
   * @return answerList
  **/
  @ApiModelProperty(value = "")


  public List<String> getAnswerList() {
    return answerList;
  }

  public void setAnswerList(List<String> answerList) {
    this.answerList = answerList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(this.questionVarName, survey.questionVarName) &&
        Objects.equals(this.answerList, survey.answerList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionVarName, answerList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    questionVarName: ").append(toIndentedString(questionVarName)).append("\n");
    sb.append("    answerList: ").append(toIndentedString(answerList)).append("\n");
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

