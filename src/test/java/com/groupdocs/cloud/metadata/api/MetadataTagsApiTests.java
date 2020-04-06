/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.metadata.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.metadata.client.ApiException;
import com.groupdocs.cloud.metadata.model.requests.*;
import com.groupdocs.cloud.metadata.model.*;

import org.junit.Test;

public class MetadataTagsApiTests extends BaseApiTest {

	@Test
	public void TagsApiTest() throws ApiException {
		// Arrange
		TagsOptions options = new TagsOptions();
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		TagsRequest request = new TagsRequest(options);

		// Act & Assert
		TagsResult result = infoApi.tags(request);

		assertNotNull(result);
		assertNotNull(result.getRootPackage());
		assertNotNull(result.getRootPackage().getInnerPackages());
		assertTrue(result.getRootPackage().getInnerPackages().size() > 0);
	}
	
	@Test
	public void Tags_DocumentProtectedException() {
		// Arrange
		TagsOptions options = new TagsOptions();
		options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
		TagsRequest request = new TagsRequest(options);

		// Act & Assert
		try {
			infoApi.tags(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'documents\\sample-with-password.docx' is protected.", ex.getMessage());
		}
	}

	@Test
	public void Tags_FileNotFound() {
		// Arrange
		TagsOptions options = new TagsOptions();
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		TagsRequest request = new TagsRequest(options);

		// Act & Assert
		try {
			infoApi.tags(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}

	@Test
	public void Tags_UnsupportedFormat() {
		// Arrange
		TagsOptions options = new TagsOptions();
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		TagsRequest request = new TagsRequest(options);

		// Act & Assert
		try {
			infoApi.tags(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'files\\sample.json' has type which is not currently supported.",
					ex.getMessage());
		}
	}
}
