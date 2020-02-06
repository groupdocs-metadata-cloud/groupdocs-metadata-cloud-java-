/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AddResult.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Add result
 */
@ApiModel(description = "Add result")
public class AddResult {
  @SerializedName("path")
  private String path = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("addedCount")
  private Integer addedCount = null;

  public AddResult path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Gets or sets the path.
   * @return path
  **/
  @ApiModelProperty(value = "Gets or sets the path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AddResult url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Gets or sets the URL.
   * @return url
  **/
  @ApiModelProperty(value = "Gets or sets the URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AddResult addedCount(Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

   /**
   * Gets or sets the added count.
   * @return addedCount
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the added count.")
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddResult addResult = (AddResult) o;
    return Objects.equals(this.path, addResult.path) &&
        Objects.equals(this.url, addResult.url) &&
        Objects.equals(this.addedCount, addResult.addedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, url, addedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddResult {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
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

