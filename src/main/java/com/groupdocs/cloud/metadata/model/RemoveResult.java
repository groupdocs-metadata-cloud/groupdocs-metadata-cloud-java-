/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RemoveResult.java">
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
 * Remove result
 */
@ApiModel(description = "Remove result")
public class RemoveResult {
  @SerializedName("path")
  private String path = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("removedCount")
  private Integer removedCount = null;

  public RemoveResult path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Resultant file path in storage.
   * @return path
  **/
  @ApiModelProperty(value = "Resultant file path in storage.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RemoveResult url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Resultant file download url.
   * @return url
  **/
  @ApiModelProperty(value = "Resultant file download url.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RemoveResult removedCount(Integer removedCount) {
    this.removedCount = removedCount;
    return this;
  }

   /**
   * Total count of removed properties.
   * @return removedCount
  **/
  @ApiModelProperty(required = true, value = "Total count of removed properties.")
  public Integer getRemovedCount() {
    return removedCount;
  }

  public void setRemovedCount(Integer removedCount) {
    this.removedCount = removedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveResult removeResult = (RemoveResult) o;
    return Objects.equals(this.path, removeResult.path) &&
        Objects.equals(this.url, removeResult.url) &&
        Objects.equals(this.removedCount, removeResult.removedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, url, removedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveResult {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    removedCount: ").append(toIndentedString(removedCount)).append("\n");
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

