/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="NameOptions.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.metadata.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.metadata.model.MatchOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Name options
 */
@ApiModel(description = "Name options")
public class NameOptions {
  @SerializedName("value")
  private String value = null;

  @SerializedName("matchOptions")
  private MatchOptions matchOptions = null;

  public NameOptions value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets the value.
   * @return value
  **/
  @ApiModelProperty(value = "Gets or sets the value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NameOptions matchOptions(MatchOptions matchOptions) {
    this.matchOptions = matchOptions;
    return this;
  }

   /**
   * Gets or sets the match options.
   * @return matchOptions
  **/
  @ApiModelProperty(value = "Gets or sets the match options.")
  public MatchOptions getMatchOptions() {
    return matchOptions;
  }

  public void setMatchOptions(MatchOptions matchOptions) {
    this.matchOptions = matchOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameOptions nameOptions = (NameOptions) o;
    return Objects.equals(this.value, nameOptions.value) &&
        Objects.equals(this.matchOptions, nameOptions.matchOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, matchOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameOptions {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    matchOptions: ").append(toIndentedString(matchOptions)).append("\n");
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

