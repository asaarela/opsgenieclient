/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * AddAlertDetailsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:12:50.652+03:00")
public class AddAlertDetailsRequest {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("details")
  private Map<String, String> details = new HashMap<String, String>();

  public AddAlertDetailsRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Display name of the request owner
   * @return user
  **/
  @ApiModelProperty(value = "Display name of the request owner")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AddAlertDetailsRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Additional note that will be added while creating the alert
   * @return note
  **/
  @ApiModelProperty(value = "Additional note that will be added while creating the alert")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public AddAlertDetailsRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source field of the alert. Default value is IP address of the incoming request
   * @return source
  **/
  @ApiModelProperty(value = "Source field of the alert. Default value is IP address of the incoming request")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AddAlertDetailsRequest details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public AddAlertDetailsRequest putDetailsItem(String key, String detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Key-value pairs to add as custom property into alert. You can refer here for example values
   * @return details
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Key-value pairs to add as custom property into alert. You can refer here for example values")
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AddAlertDetailsRequest addAlertDetailsRequest = (AddAlertDetailsRequest) o;
    return ObjectUtils.equals(this.user, addAlertDetailsRequest.user) &&
    ObjectUtils.equals(this.note, addAlertDetailsRequest.note) &&
    ObjectUtils.equals(this.source, addAlertDetailsRequest.source) &&
    ObjectUtils.equals(this.details, addAlertDetailsRequest.details);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(user, note, source, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAlertDetailsRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

