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
import com.groupdocs.cloud.metadata.model.MatchOptions;
import com.groupdocs.cloud.metadata.model.NameOptions;
import com.groupdocs.cloud.metadata.model.RemoveOptions;
import com.groupdocs.cloud.metadata.model.RemoveResult;
import com.groupdocs.cloud.metadata.model.SearchCriteria;
import com.groupdocs.cloud.metadata.model.Tag;
import com.groupdocs.cloud.metadata.model.TagOptions;
import com.groupdocs.cloud.metadata.model.ValueOptions;
import com.groupdocs.cloud.metadata.model.requests.RemoveRequest;

public class MetadataRemoveApiTests extends BaseApiTest {

	@Test
	public void RemoveApiTest_Tag() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_PossibleTagName() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		tagOptions.setPossibleName("creator");
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_PropertyName() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("Application");
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_PropertyNameExactPhrase() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("NameOfApplication");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setExactPhrase(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_PropertyNameRegex() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("^[N]ame[A-Z].*");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setIsRegex(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_PropertyValue() throws ApiException {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		ValueOptions valueOptions = new ValueOptions();
		valueOptions.setValue("Microsoft Office Word");
		valueOptions.setType("string");
		searchCriteria.setValueOptions(valueOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		RemoveResult result = metadataApi.remove(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getRemovedCount() > 0);
	}

	@Test
	public void RemoveApiTest_IncorrectTag() {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Wrong");
		tag.setCategory("Wrong");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		try {
			metadataApi.remove(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified tag was not found or has incorrect format.", ex.getMessage());
		}
	}

	@Test
	public void Remove_DocumentProtectedException() {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		try {
			metadataApi.remove(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'documents\\sample-with-password.docx' is protected.", ex.getMessage());
		}
	}

	@Test
	public void Remove_UnsupportedFormat() {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		try {
			metadataApi.remove(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'files\\sample.json' has type which is not currently supported.",
					ex.getMessage());
		}
	}

	@Test
	public void Remove_FileNotFound() {
		// Arrange
		RemoveOptions options = new RemoveOptions();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		options.setSearchCriteria(searchCriteria);
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		RemoveRequest request = new RemoveRequest(options);

		// Act & Assert
		try {
			metadataApi.remove(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}
}
