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
import java.util.List;
import java.util.Map;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class ErrorResponse {
    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("took")
    private Float took = 0.0f;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("code")
    private Integer code = null;

    @JsonProperty("responseHeaders")
    private Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();

    public ErrorResponse requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ErrorResponse took(Float took) {
        this.took = took;
        return this;
    }

    /**
     * Get took
     *
     * @return took
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public Float getTook() {
        return took;
    }

    public void setTook(Float took) {
        this.took = took;
    }

    public ErrorResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @ApiModelProperty(value = "")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ErrorResponse responseHeaders(Map<String, List<String>> responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    public ErrorResponse putResponseHeadersItem(String key, List<String> responseHeadersItem) {
        this.responseHeaders.put(key, responseHeadersItem);
        return this;
    }

    /**
     * Get responseHeaders
     *
     * @return responseHeaders
     **/
    @ApiModelProperty(value = "")
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Map<String, List<String>> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) o;
        return ObjectUtils.equals(this.requestId, errorResponse.requestId) &&
                ObjectUtils.equals(this.took, errorResponse.took) &&
                ObjectUtils.equals(this.message, errorResponse.message) &&
                ObjectUtils.equals(this.code, errorResponse.code) &&
                ObjectUtils.equals(this.responseHeaders, errorResponse.responseHeaders);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(requestId, took, message, code, responseHeaders);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    took: ").append(toIndentedString(took)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
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
