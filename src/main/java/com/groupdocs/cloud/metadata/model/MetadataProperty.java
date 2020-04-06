/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MetadataProperty.java">
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
import com.groupdocs.cloud.metadata.model.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata property
 */
@ApiModel(description = "Metadata property")
public class MetadataProperty {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("propertyType")
  private String propertyType = null;

  @SerializedName("accessLevel")
  private String accessLevel = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public MetadataProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the property.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetadataProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the property.
   * @return value
  **/
  @ApiModelProperty(value = "Value of the property.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MetadataProperty propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Property type.
   * @return propertyType
  **/
  @ApiModelProperty(value = "Property type.")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public MetadataProperty accessLevel(String accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * Property access level.
   * @return accessLevel
  **/
  @ApiModelProperty(value = "Property access level.")
  public String getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(String accessLevel) {
    this.accessLevel = accessLevel;
  }

  public MetadataProperty tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public MetadataProperty addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Collection of the property tags.
   * @return tags
  **/
  @ApiModelProperty(value = "Collection of the property tags.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataProperty metadataProperty = (MetadataProperty) o;
    return Objects.equals(this.name, metadataProperty.name) &&
        Objects.equals(this.value, metadataProperty.value) &&
        Objects.equals(this.propertyType, metadataProperty.propertyType) &&
        Objects.equals(this.accessLevel, metadataProperty.accessLevel) &&
        Objects.equals(this.tags, metadataProperty.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, propertyType, accessLevel, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

