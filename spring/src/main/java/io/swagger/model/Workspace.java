package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkspaceBasic;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Workspace
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T17:21:26.661Z")

public class Workspace extends WorkspaceBasic  {
  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  @JsonProperty("CI")
  private String CI = null;

  public Workspace groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public Workspace addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Active directory
   * @return groups
  **/
  @ApiModelProperty(example = "[\"BI-LINUX\",\"BI-USER\"]", value = "Active directory")


  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public Workspace CI(String CI) {
    this.CI = CI;
    return this;
  }

  /**
   * Configuration Item
   * @return CI
  **/
  @ApiModelProperty(example = "BI-AS-DATALAKE", value = "Configuration Item")


  public String getCI() {
    return CI;
  }

  public void setCI(String CI) {
    this.CI = CI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.groups, workspace.groups) &&
        Objects.equals(this.CI, workspace.CI) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, CI, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    CI: ").append(toIndentedString(CI)).append("\n");
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

