/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AddProperty.java">
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
import com.groupdocs.cloud.metadata.model.SearchCriteriaWithoutValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Property to add
 */
@ApiModel(description = "Property to add")
public class AddProperty {
  @SerializedName("value")
  private String value = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("searchCriteria")
  private SearchCriteriaWithoutValue searchCriteria = null;

  public AddProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the property.
   * @return value
  **/
  @ApiModelProperty(value = "The value of the property.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AddProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Value type.
   * @return type
  **/
  @ApiModelProperty(value = "Value type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AddProperty searchCriteria(SearchCriteriaWithoutValue searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

   /**
   * Options to define metadata property tag or name.
   * @return searchCriteria
  **/
  @ApiModelProperty(value = "Options to define metadata property tag or name.")
  public SearchCriteriaWithoutValue getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(SearchCriteriaWithoutValue searchCriteria) {
    this.searchCriteria = searchCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddProperty addProperty = (AddProperty) o;
    return Objects.equals(this.value, addProperty.value) &&
        Objects.equals(this.type, addProperty.type) &&
        Objects.equals(this.searchCriteria, addProperty.searchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, searchCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddProperty {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    searchCriteria: ").append(toIndentedString(searchCriteria)).append("\n");
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

