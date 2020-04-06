/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ExtractResult.java">
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
import com.groupdocs.cloud.metadata.model.MetadataPackage;
import com.groupdocs.cloud.metadata.model.MetadataProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Extract result
 */
@ApiModel(description = "Extract result")
public class ExtractResult {
  @SerializedName("metadataTree")
  private MetadataPackage metadataTree = null;

  @SerializedName("properties")
  private List<MetadataProperty> properties = null;

  public ExtractResult metadataTree(MetadataPackage metadataTree) {
    this.metadataTree = metadataTree;
    return this;
  }

   /**
   * Whole metadata tree of the file.
   * @return metadataTree
  **/
  @ApiModelProperty(value = "Whole metadata tree of the file.")
  public MetadataPackage getMetadataTree() {
    return metadataTree;
  }

  public void setMetadataTree(MetadataPackage metadataTree) {
    this.metadataTree = metadataTree;
  }

  public ExtractResult properties(List<MetadataProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ExtractResult addPropertiesItem(MetadataProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<MetadataProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Metadata properties found by tag.
   * @return properties
  **/
  @ApiModelProperty(value = "Metadata properties found by tag.")
  public List<MetadataProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<MetadataProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractResult extractResult = (ExtractResult) o;
    return Objects.equals(this.metadataTree, extractResult.metadataTree) &&
        Objects.equals(this.properties, extractResult.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataTree, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractResult {\n");
    
    sb.append("    metadataTree: ").append(toIndentedString(metadataTree)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

