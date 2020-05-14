package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnvironmentName;
import io.swagger.model.Metadata;
import io.swagger.model.Status;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnvironmentStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

public class EnvironmentStatus   {
  @JsonProperty("environmentName")
  private EnvironmentName environmentName = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("metaData")
  private Metadata metaData = null;

  public EnvironmentStatus environmentName(EnvironmentName environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * Get environmentName
   * @return environmentName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnvironmentName getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(EnvironmentName environmentName) {
    this.environmentName = environmentName;
  }

  public EnvironmentStatus status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public EnvironmentStatus metaData(Metadata metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Metadata getMetaData() {
    return metaData;
  }

  public void setMetaData(Metadata metaData) {
    this.metaData = metaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentStatus environmentStatus = (EnvironmentStatus) o;
    return Objects.equals(this.environmentName, environmentStatus.environmentName) &&
        Objects.equals(this.status, environmentStatus.status) &&
        Objects.equals(this.metaData, environmentStatus.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, status, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentStatus {\n");
    
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

