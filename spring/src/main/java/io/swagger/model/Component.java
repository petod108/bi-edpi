package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentStatus;
import io.swagger.model.Product;
import io.swagger.model.Survey;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Component
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

public class Component extends Product  {
  @JsonProperty("idComponent")
  private UUID idComponent = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("EnvironmentsStatus")
  @Valid
  private List<EnvironmentStatus> environmentsStatus = null;

  public Component idComponent(UUID idComponent) {
    this.idComponent = idComponent;
    return this;
  }

  /**
   * Get idComponent
   * @return idComponent
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "")

  @Valid

  public UUID getIdComponent() {
    return idComponent;
  }

  public void setIdComponent(UUID idComponent) {
    this.idComponent = idComponent;
  }

  public Component name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Component environmentsStatus(List<EnvironmentStatus> environmentsStatus) {
    this.environmentsStatus = environmentsStatus;
    return this;
  }

  public Component addEnvironmentsStatusItem(EnvironmentStatus environmentsStatusItem) {
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
    Component component = (Component) o;
    return Objects.equals(this.idComponent, component.idComponent) &&
        Objects.equals(this.name, component.name) &&
        Objects.equals(this.environmentsStatus, component.environmentsStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idComponent, name, environmentsStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Component {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    idComponent: ").append(toIndentedString(idComponent)).append("\n");
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

