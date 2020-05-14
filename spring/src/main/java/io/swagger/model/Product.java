package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Survey;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

public class Product   {
  @JsonProperty("idProduct")
  private UUID idProduct = null;

  @JsonProperty("survey")
  private Survey survey = null;

  public Product idProduct(UUID idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Get idProduct
   * @return idProduct
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull

  @Valid

  public UUID getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(UUID idProduct) {
    this.idProduct = idProduct;
  }

  public Product survey(Survey survey) {
    this.survey = survey;
    return this;
  }

  /**
   * Get survey
   * @return survey
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    Product product = (Product) o;
    return Objects.equals(this.idProduct, product.idProduct) &&
        Objects.equals(this.survey, product.survey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduct, survey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    idProduct: ").append(toIndentedString(idProduct)).append("\n");
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

