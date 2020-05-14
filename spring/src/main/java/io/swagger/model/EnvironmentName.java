package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EnvironmentName
 */
public enum EnvironmentName {
  
  DEV("DEV"),
  
  QA("QA"),
  
  PROD("PROD");

  private String value;

  EnvironmentName(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnvironmentName fromValue(String text) {
    for (EnvironmentName b : EnvironmentName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

