package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Product;
import io.swagger.model.Question;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product Definition
 */
@ApiModel(description = "Product Definition")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T17:21:26.661Z")

public class ProductDefinition extends Product  {
  @JsonProperty("QuestionList")
  @Valid
  private List<Question> questionList = null;

  public ProductDefinition questionList(List<Question> questionList) {
    this.questionList = questionList;
    return this;
  }

  public ProductDefinition addQuestionListItem(Question questionListItem) {
    if (this.questionList == null) {
      this.questionList = new ArrayList<Question>();
    }
    this.questionList.add(questionListItem);
    return this;
  }

  /**
   * Get questionList
   * @return questionList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Question> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<Question> questionList) {
    this.questionList = questionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDefinition productDefinition = (ProductDefinition) o;
    return Objects.equals(this.questionList, productDefinition.questionList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDefinition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
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

