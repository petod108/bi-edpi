package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Product;
import io.swagger.model.Survey;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductSurvey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:22.170Z")

public class ProductSurvey extends Product  {
  @JsonProperty("survey")
  private Survey survey = null;

  public ProductSurvey survey(Survey survey) {
    this.survey = survey;
    return this;
  }

  /**
   * Get survey
   * @return survey
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Survey getSurvey() {
    return survey;
  }

  public void setSurvey(Survey survey) {
    this.survey = survey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSurvey productSurvey = (ProductSurvey) o;
    return Objects.equals(this.survey, productSurvey.survey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(survey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSurvey {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    survey: ").append(toIndentedString(survey)).append("\n");
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

