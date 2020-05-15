package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeployRegion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:56.888Z")

public class DeployRegion   {
  /**
   * Gets or Sets city
   */
  public enum CityEnum {
    BARCELONA("BARCELONA"),
    
    INGELHEIM("INGELHEIM");

    private String value;

    CityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CityEnum fromValue(String text) {
      for (CityEnum b : CityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("city")
  private CityEnum city = null;

  /**
   * Gets or Sets country
   */
  public enum CountryEnum {
    SPAIN("SPAIN"),
    
    EEUU("EEUU"),
    
    GERMANY("GERMANY");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryEnum fromValue(String text) {
      for (CountryEnum b : CountryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("country")
  private CountryEnum country = null;

  @JsonProperty("managedBy")
  private String managedBy = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("ci")
  private String ci = null;

  public DeployRegion city(CityEnum city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public CityEnum getCity() {
    return city;
  }

  public void setCity(CityEnum city) {
    this.city = city;
  }

  public DeployRegion country(CountryEnum country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public DeployRegion managedBy(String managedBy) {
    this.managedBy = managedBy;
    return this;
  }

  /**
   * Get managedBy
   * @return managedBy
  **/
  @ApiModelProperty(value = "")


  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(String managedBy) {
    this.managedBy = managedBy;
  }

  public DeployRegion provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")


  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public DeployRegion ci(String ci) {
    this.ci = ci;
    return this;
  }

  /**
   * Get ci
   * @return ci
  **/
  @ApiModelProperty(value = "")


  public String getCi() {
    return ci;
  }

  public void setCi(String ci) {
    this.ci = ci;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployRegion deployRegion = (DeployRegion) o;
    return Objects.equals(this.city, deployRegion.city) &&
        Objects.equals(this.country, deployRegion.country) &&
        Objects.equals(this.managedBy, deployRegion.managedBy) &&
        Objects.equals(this.provider, deployRegion.provider) &&
        Objects.equals(this.ci, deployRegion.ci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, managedBy, provider, ci);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployRegion {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
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

