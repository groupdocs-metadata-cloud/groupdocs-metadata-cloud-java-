/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SetOptions.java">
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
import com.groupdocs.cloud.metadata.model.FileInfo;
import com.groupdocs.cloud.metadata.model.SetProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Set options
 */
@ApiModel(description = "Set options")
public class SetOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("properties")
  private List<SetProperty> properties = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  public SetOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * The file information in storage.
   * @return fileInfo
  **/
  @ApiModelProperty(value = "The file information in storage.")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public SetOptions properties(List<SetProperty> properties) {
    this.properties = properties;
    return this;
  }

  public SetOptions addPropertiesItem(SetProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<SetProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Collection of properties to set.
   * @return properties
  **/
  @ApiModelProperty(value = "Collection of properties to set.")
  public List<SetProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<SetProperty> properties) {
    this.properties = properties;
  }

  public SetOptions outputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
    return this;
  }

   /**
   * The output folder.
   * @return outputFolder
  **/
  @ApiModelProperty(value = "The output folder.")
  public String getOutputFolder() {
    return outputFolder;
  }

  public void setOutputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetOptions setOptions = (SetOptions) o;
    return Objects.equals(this.fileInfo, setOptions.fileInfo) &&
        Objects.equals(this.properties, setOptions.properties) &&
        Objects.equals(this.outputFolder, setOptions.outputFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, properties, outputFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
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

