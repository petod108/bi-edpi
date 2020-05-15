package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentStatusMetadataSurvey;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComponentInstanceMetadataSurvey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:22.170Z")

public class ComponentInstanceMetadataSurvey   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("EnvironmentStatusMetadataSurveys")
  @Valid
  private List<EnvironmentStatusMetadataSurvey> environmentStatusMetadataSurveys = null;

  public ComponentInstanceMetadataSurvey id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ComponentInstanceMetadataSurvey name(String name) {
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

  public ComponentInstanceMetadataSurvey environmentStatusMetadataSurveys(List<EnvironmentStatusMetadataSurvey> environmentStatusMetadataSurveys) {
    this.environmentStatusMetadataSurveys = environmentStatusMetadataSurveys;
    return this;
  }

  public ComponentInstanceMetadataSurvey addEnvironmentStatusMetadataSurveysItem(EnvironmentStatusMetadataSurvey environmentStatusMetadataSurveysItem) {
    if (this.environmentStatusMetadataSurveys == null) {
      this.environmentStatusMetadataSurveys = new ArrayList<EnvironmentStatusMetadataSurvey>();
    }
    this.environmentStatusMetadataSurveys.add(environmentStatusMetadataSurveysItem);
    return this;
  }

  /**
   * Get environmentStatusMetadataSurveys
   * @return environmentStatusMetadataSurveys
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EnvironmentStatusMetadataSurvey> getEnvironmentStatusMetadataSurveys() {
    return environmentStatusMetadataSurveys;
  }

  public void setEnvironmentStatusMetadataSurveys(List<EnvironmentStatusMetadataSurvey> environmentStatusMetadataSurveys) {
    this.environmentStatusMetadataSurveys = environmentStatusMetadataSurveys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentInstanceMetadataSurvey componentInstanceMetadataSurvey = (ComponentInstanceMetadataSurvey) o;
    return Objects.equals(this.id, componentInstanceMetadataSurvey.id) &&
        Objects.equals(this.name, componentInstanceMetadataSurvey.name) &&
        Objects.equals(this.environmentStatusMetadataSurveys, componentInstanceMetadataSurvey.environmentStatusMetadataSurveys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, environmentStatusMetadataSurveys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentInstanceMetadataSurvey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    environmentStatusMetadataSurveys: ").append(toIndentedString(environmentStatusMetadataSurveys)).append("\n");
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

