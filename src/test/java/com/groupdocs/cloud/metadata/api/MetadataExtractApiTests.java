/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.metadata.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.groupdocs.cloud.metadata.client.ApiException;
import com.groupdocs.cloud.metadata.model.ExtractOptions;
import com.groupdocs.cloud.metadata.model.ExtractResult;
import com.groupdocs.cloud.metadata.model.MatchOptions;
import com.groupdocs.cloud.metadata.model.NameOptions;
import com.groupdocs.cloud.metadata.model.SearchCriteria;
import com.groupdocs.cloud.metadata.model.Tag;
import com.groupdocs.cloud.metadata.model.TagOptions;
import com.groupdocs.cloud.metadata.model.ValueOptions;
import com.groupdocs.cloud.metadata.model.requests.ExtractRequest;

public class MetadataExtractApiTests extends BaseApiTest {

	@Test
	public void ExtractApiTest() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result.getMetadataTree());
		assertNotNull(result.getMetadataTree().getInnerPackages());
		assertTrue(result.getMetadataTree().getInnerPackages().size() > 0);
	}

	@Test
	public void ExtractApiTest_Tag() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_PossibleTagName() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		tagOptions.setPossibleName("creator");
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_PropertyName() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("Date");
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_PropertyNameExactPhrase() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("MimeType");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setExactPhrase(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_PropertyNameRegex() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("^dc:.*");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setIsRegex(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_PropertyValue() throws ApiException {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		ValueOptions valueOptions = new ValueOptions();
		valueOptions.setValue("Microsoft Office Word");
		valueOptions.setType("string");
		searchCriteria.setValueOptions(valueOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		ExtractResult result = metadataApi.extract(request);

		assertNotNull(result);
		assertNotNull(result.getProperties());
		assertTrue(result.getProperties().size() > 0);
	}

	@Test
	public void ExtractApiTest_IncorrectTag() {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Wrong");
		tag.setCategory("Wrong");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		try {
			metadataApi.extract(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified tag was not found or has incorrect format.", ex.getMessage());
		}
	}

	@Test
	public void ExtractApiTest_DocumentProtectedException() {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		try {
			metadataApi.extract(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'documents\\sample-with-password.docx' is protected.", ex.getMessage());
		}
	}

	@Test
	public void ExtractApiTest_UnsupportedFormat() {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		try {
			metadataApi.extract(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'files\\sample.json' has type which is not currently supported.",
					ex.getMessage());
		}
	}

	@Test
	public void ExtractApiTest_FileNotFound() {
		// Arrange
		ExtractOptions options = new ExtractOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		ExtractRequest request = new ExtractRequest(options);

		// Act & Assert
		try {
			metadataApi.extract(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}
}
