package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentName;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:56.888Z")

public class    {
  @JsonProperty("Environments")
  @Valid
  private List<EnvironmentName> environments = null;

  public  environments(List<EnvironmentName> environments) {
    this.environments = environments;
    return this;
  }

  public  addEnvironmentsItem(EnvironmentName environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<EnvironmentName>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EnvironmentName> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<EnvironmentName> environments) {
    this.environments = environments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      = () o;
    return Objects.equals(this.environments, .environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class  {\n");
    
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

