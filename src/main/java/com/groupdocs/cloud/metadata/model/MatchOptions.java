/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MatchOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Match string options
 */
@ApiModel(description = "Match string options")
public class MatchOptions {
  @SerializedName("exactPhrase")
  private Boolean exactPhrase = null;

  @SerializedName("isRegex")
  private Boolean isRegex = null;

  public MatchOptions exactPhrase(Boolean exactPhrase) {
    this.exactPhrase = exactPhrase;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to match exact string phrase.
   * @return exactPhrase
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to match exact string phrase.")
  public Boolean getExactPhrase() {
    return exactPhrase;
  }

  public void setExactPhrase(Boolean exactPhrase) {
    this.exactPhrase = exactPhrase;
  }

  public MatchOptions isRegex(Boolean isRegex) {
    this.isRegex = isRegex;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to match by regular expression.
   * @return isRegex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to match by regular expression.")
  public Boolean getIsRegex() {
    return isRegex;
  }

  public void setIsRegex(Boolean isRegex) {
    this.isRegex = isRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchOptions matchOptions = (MatchOptions) o;
    return Objects.equals(this.exactPhrase, matchOptions.exactPhrase) &&
        Objects.equals(this.isRegex, matchOptions.isRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exactPhrase, isRegex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchOptions {\n");
    
    sb.append("    exactPhrase: ").append(toIndentedString(exactPhrase)).append("\n");
    sb.append("    isRegex: ").append(toIndentedString(isRegex)).append("\n");
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

