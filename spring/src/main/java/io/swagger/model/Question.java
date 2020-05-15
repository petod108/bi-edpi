package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ComponentType;
import io.swagger.model.DeployRegion;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Question
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:22.170Z")

public class Question extends ComponentType  {
  @JsonProperty("prompt")
  private String prompt = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("variableName")
  private String variableName = null;

  /**
   * Gets or Sets answerType
   */
  public enum AnswerTypeEnum {
    EXT("EXT"),
    
    TEXT_AREA("TEXT_AREA"),
    
    PASSWORD("PASSWORD"),
    
    SINGLE_SELECT_LIST("SINGLE_SELECT_LIST"),
    
    MULTIPLE_SELECT_LIST("MULTIPLE_SELECT_LIST"),
    
    INTEGER("INTEGER"),
    
    FLOAT("FLOAT");

    private String value;

    AnswerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnswerTypeEnum fromValue(String text) {
      for (AnswerTypeEnum b : AnswerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("answerType")
  private AnswerTypeEnum answerType = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("hidden")
  private Boolean hidden = null;

  public Question prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * prompt
   * @return prompt
  **/
  @ApiModelProperty(value = "prompt")


  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public Question description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Question variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Get variableName
   * @return variableName
  **/
  @ApiModelProperty(value = "")


  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public Question answerType(AnswerTypeEnum answerType) {
    this.answerType = answerType;
    return this;
  }

  /**
   * Get answerType
   * @return answerType
  **/
  @ApiModelProperty(value = "")


  public AnswerTypeEnum getAnswerType() {
    return answerType;
  }

  public void setAnswerType(AnswerTypeEnum answerType) {
    this.answerType = answerType;
  }

  public Question mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(value = "")


  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public Question hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Get hidden
   * @return hidden
  **/
  @ApiModelProperty(value = "")


  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.prompt, question.prompt) &&
        Objects.equals(this.description, question.description) &&
        Objects.equals(this.variableName, question.variableName) &&
        Objects.equals(this.answerType, question.answerType) &&
        Objects.equals(this.mandatory, question.mandatory) &&
        Objects.equals(this.hidden, question.hidden) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, description, variableName, answerType, mandatory, hidden, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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

