/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MetadataPackage.java">
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
import com.groupdocs.cloud.metadata.model.MetadataPackage;
import com.groupdocs.cloud.metadata.model.MetadataProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata package
 */
@ApiModel(description = "Metadata package")
public class MetadataPackage {
  @SerializedName("packageName")
  private String packageName = null;

  @SerializedName("packageProperties")
  private List<MetadataProperty> packageProperties = null;

  @SerializedName("innerPackages")
  private List<MetadataPackage> innerPackages = null;

  public MetadataPackage packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * Name of the metadata package.
   * @return packageName
  **/
  @ApiModelProperty(value = "Name of the metadata package.")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public MetadataPackage packageProperties(List<MetadataProperty> packageProperties) {
    this.packageProperties = packageProperties;
    return this;
  }

  public MetadataPackage addPackagePropertiesItem(MetadataProperty packagePropertiesItem) {
    if (this.packageProperties == null) {
      this.packageProperties = new ArrayList<MetadataProperty>();
    }
    this.packageProperties.add(packagePropertiesItem);
    return this;
  }

   /**
   * Properties of the metadata package.
   * @return packageProperties
  **/
  @ApiModelProperty(value = "Properties of the metadata package.")
  public List<MetadataProperty> getPackageProperties() {
    return packageProperties;
  }

  public void setPackageProperties(List<MetadataProperty> packageProperties) {
    this.packageProperties = packageProperties;
  }

  public MetadataPackage innerPackages(List<MetadataPackage> innerPackages) {
    this.innerPackages = innerPackages;
    return this;
  }

  public MetadataPackage addInnerPackagesItem(MetadataPackage innerPackagesItem) {
    if (this.innerPackages == null) {
      this.innerPackages = new ArrayList<MetadataPackage>();
    }
    this.innerPackages.add(innerPackagesItem);
    return this;
  }

   /**
   * Inner packages of current metadata package.
   * @return innerPackages
  **/
  @ApiModelProperty(value = "Inner packages of current metadata package.")
  public List<MetadataPackage> getInnerPackages() {
    return innerPackages;
  }

  public void setInnerPackages(List<MetadataPackage> innerPackages) {
    this.innerPackages = innerPackages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataPackage metadataPackage = (MetadataPackage) o;
    return Objects.equals(this.packageName, metadataPackage.packageName) &&
        Objects.equals(this.packageProperties, metadataPackage.packageProperties) &&
        Objects.equals(this.innerPackages, metadataPackage.innerPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageName, packageProperties, innerPackages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataPackage {\n");
    
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageProperties: ").append(toIndentedString(packageProperties)).append("\n");
    sb.append("    innerPackages: ").append(toIndentedString(innerPackages)).append("\n");
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

