package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentStatus;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComponentInstance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:22.170Z")

public class ComponentInstance   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("EnvironmentsStatus")
  @Valid
  private List<EnvironmentStatus> environmentsStatus = null;

  public ComponentInstance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "RStudio component", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentInstance environmentsStatus(List<EnvironmentStatus> environmentsStatus) {
    this.environmentsStatus = environmentsStatus;
    return this;
  }

  public ComponentInstance addEnvironmentsStatusItem(EnvironmentStatus environmentsStatusItem) {
    if (this.environmentsStatus == null) {
      this.environmentsStatus = new ArrayList<EnvironmentStatus>();
    }
    this.environmentsStatus.add(environmentsStatusItem);
    return this;
  }

  /**
   * Get environmentsStatus
   * @return environmentsStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EnvironmentStatus> getEnvironmentsStatus() {
    return environmentsStatus;
  }

  public void setEnvironmentsStatus(List<EnvironmentStatus> environmentsStatus) {
    this.environmentsStatus = environmentsStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentInstance componentInstance = (ComponentInstance) o;
    return Objects.equals(this.name, componentInstance.name) &&
        Objects.equals(this.environmentsStatus, componentInstance.environmentsStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, environmentsStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentInstance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    environmentsStatus: ").append(toIndentedString(environmentsStatus)).append("\n");
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

