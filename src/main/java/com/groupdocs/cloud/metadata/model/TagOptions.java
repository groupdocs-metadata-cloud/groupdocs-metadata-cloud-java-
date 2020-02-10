/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TagOptions.java">
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
import com.groupdocs.cloud.metadata.model.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tag options
 */
@ApiModel(description = "Tag options")
public class TagOptions {
  @SerializedName("possibleName")
  private String possibleName = null;

  @SerializedName("exactTag")
  private Tag exactTag = null;

  public TagOptions possibleName(String possibleName) {
    this.possibleName = possibleName;
    return this;
  }

   /**
   * A part or a possible tag name.
   * @return possibleName
  **/
  @ApiModelProperty(value = "A part or a possible tag name.")
  public String getPossibleName() {
    return possibleName;
  }

  public void setPossibleName(String possibleName) {
    this.possibleName = possibleName;
  }

  public TagOptions exactTag(Tag exactTag) {
    this.exactTag = exactTag;
    return this;
  }

   /**
   * Options to specify exact tag.
   * @return exactTag
  **/
  @ApiModelProperty(value = "Options to specify exact tag.")
  public Tag getExactTag() {
    return exactTag;
  }

  public void setExactTag(Tag exactTag) {
    this.exactTag = exactTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagOptions tagOptions = (TagOptions) o;
    return Objects.equals(this.possibleName, tagOptions.possibleName) &&
        Objects.equals(this.exactTag, tagOptions.exactTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(possibleName, exactTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagOptions {\n");
    
    sb.append("    possibleName: ").append(toIndentedString(possibleName)).append("\n");
    sb.append("    exactTag: ").append(toIndentedString(exactTag)).append("\n");
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

