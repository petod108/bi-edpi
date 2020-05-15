package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentName;
import io.swagger.model.EnvironmentStatus;
import io.swagger.model.Metadata;
import io.swagger.model.Survey;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnvironmentStatusMetadataSurvey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T17:21:26.661Z")

public class EnvironmentStatusMetadataSurvey   {
  @JsonProperty("environment")
  private EnvironmentName environment = null;

  @JsonProperty("status")
  private EnvironmentStatus status = null;

  @JsonProperty("metadata")
  @Valid
  private List<Metadata> metadata = null;

  @JsonProperty("surveyList")
  @Valid
  private List<Survey> surveyList = null;

  public EnvironmentStatusMetadataSurvey environment(EnvironmentName environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnvironmentName getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentName environment) {
    this.environment = environment;
  }

  public EnvironmentStatusMetadataSurvey status(EnvironmentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnvironmentStatus getStatus() {
    return status;
  }

  public void setStatus(EnvironmentStatus status) {
    this.status = status;
  }

  public EnvironmentStatusMetadataSurvey metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public EnvironmentStatusMetadataSurvey addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<Metadata>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Metadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }

  public EnvironmentStatusMetadataSurvey surveyList(List<Survey> surveyList) {
    this.surveyList = surveyList;
    return this;
  }

  public EnvironmentStatusMetadataSurvey addSurveyListItem(Survey surveyListItem) {
    if (this.surveyList == null) {
      this.surveyList = new ArrayList<Survey>();
    }
    this.surveyList.add(surveyListItem);
    return this;
  }

  /**
   * Get surveyList
   * @return surveyList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Survey> getSurveyList() {
    return surveyList;
  }

  public void setSurveyList(List<Survey> surveyList) {
    this.surveyList = surveyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentStatusMetadataSurvey environmentStatusMetadataSurvey = (EnvironmentStatusMetadataSurvey) o;
    return Objects.equals(this.environment, environmentStatusMetadataSurvey.environment) &&
        Objects.equals(this.status, environmentStatusMetadataSurvey.status) &&
        Objects.equals(this.metadata, environmentStatusMetadataSurvey.metadata) &&
        Objects.equals(this.surveyList, environmentStatusMetadataSurvey.surveyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, status, metadata, surveyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentStatusMetadataSurvey {\n");
    
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    surveyList: ").append(toIndentedString(surveyList)).append("\n");
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

