/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchCriteriaWithoutValue.java">
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
import com.groupdocs.cloud.metadata.model.NameOptions;
import com.groupdocs.cloud.metadata.model.TagOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base search options
 */
@ApiModel(description = "Base search options")
public class SearchCriteriaWithoutValue {
  @SerializedName("tagOptions")
  private TagOptions tagOptions = null;

  @SerializedName("nameOptions")
  private NameOptions nameOptions = null;

  public SearchCriteriaWithoutValue tagOptions(TagOptions tagOptions) {
    this.tagOptions = tagOptions;
    return this;
  }

   /**
   * Options to find property by tag.
   * @return tagOptions
  **/
  @ApiModelProperty(value = "Options to find property by tag.")
  public TagOptions getTagOptions() {
    return tagOptions;
  }

  public void setTagOptions(TagOptions tagOptions) {
    this.tagOptions = tagOptions;
  }

  public SearchCriteriaWithoutValue nameOptions(NameOptions nameOptions) {
    this.nameOptions = nameOptions;
    return this;
  }

   /**
   * Options to find property by name.
   * @return nameOptions
  **/
  @ApiModelProperty(value = "Options to find property by name.")
  public NameOptions getNameOptions() {
    return nameOptions;
  }

  public void setNameOptions(NameOptions nameOptions) {
    this.nameOptions = nameOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteriaWithoutValue searchCriteriaWithoutValue = (SearchCriteriaWithoutValue) o;
    return Objects.equals(this.tagOptions, searchCriteriaWithoutValue.tagOptions) &&
        Objects.equals(this.nameOptions, searchCriteriaWithoutValue.nameOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagOptions, nameOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaWithoutValue {\n");
    
    sb.append("    tagOptions: ").append(toIndentedString(tagOptions)).append("\n");
    sb.append("    nameOptions: ").append(toIndentedString(nameOptions)).append("\n");
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

