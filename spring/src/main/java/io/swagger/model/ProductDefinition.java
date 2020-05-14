package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T17:02:23.621Z")

public class ProductDefinition extends Product  {
  @JsonProperty("definition")
  @Valid
  private List<String> definition = null;

  public ProductDefinition definition(List<String> definition) {
    this.definition = definition;
    return this;
  }

  public ProductDefinition addDefinitionItem(String definitionItem) {
    if (this.definition == null) {
      this.definition = new ArrayList<String>();
    }
    this.definition.add(definitionItem);
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")


  public List<String> getDefinition() {
    return definition;
  }

  public void setDefinition(List<String> definition) {
    this.definition = definition;
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
    return Objects.equals(this.definition, productDefinition.definition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDefinition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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

