package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DeployRegion;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComponentType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:56.888Z")

public class ComponentType   {
  @JsonProperty("deployRegion")
  private DeployRegion deployRegion = null;

  /**
   * Gets or Sets componentType
   */
  public enum ComponentTypeEnum {
    RCSTUDIO("RCSTUDIO"),
    
    JUPITERHUB("JUPITERHUB");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComponentTypeEnum fromValue(String text) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("componentType")
  private ComponentTypeEnum componentType = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("question")
  @Valid
  private List<String> question = null;

  public ComponentType deployRegion(DeployRegion deployRegion) {
    this.deployRegion = deployRegion;
    return this;
  }

  /**
   * Get deployRegion
   * @return deployRegion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeployRegion getDeployRegion() {
    return deployRegion;
  }

  public void setDeployRegion(DeployRegion deployRegion) {
    this.deployRegion = deployRegion;
  }

  public ComponentType componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(value = "")


  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public ComponentType image(String image) {
    this.image = image;
    return this;
  }

  /**
   * URL of Image
   * @return image
  **/
  @ApiModelProperty(example = "/images/image.gif", value = "URL of Image")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ComponentType question(List<String> question) {
    this.question = question;
    return this;
  }

  public ComponentType addQuestionItem(String questionItem) {
    if (this.question == null) {
      this.question = new ArrayList<String>();
    }
    this.question.add(questionItem);
    return this;
  }

  /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(value = "")


  public List<String> getQuestion() {
    return question;
  }

  public void setQuestion(List<String> question) {
    this.question = question;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentType componentType = (ComponentType) o;
    return Objects.equals(this.deployRegion, componentType.deployRegion) &&
        Objects.equals(this.componentType, componentType.componentType) &&
        Objects.equals(this.image, componentType.image) &&
        Objects.equals(this.question, componentType.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployRegion, componentType, image, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentType {\n");
    
    sb.append("    deployRegion: ").append(toIndentedString(deployRegion)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

