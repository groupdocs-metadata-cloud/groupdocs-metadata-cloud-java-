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

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.groupdocs.cloud.metadata.client.ApiException;
import com.groupdocs.cloud.metadata.model.requests.*;
import com.groupdocs.cloud.metadata.model.*;

import org.junit.Test;

public class MetadataSetApiTests extends BaseApiTest {

	@Test
	public void SetApiTest() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Creator");
		tag.setCategory("Person");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("NewAuthor");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_DateTime() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setNewValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_PossibleTagName() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		tagOptions.setPossibleName("creator");
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("new creator");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_PropertyName() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("Date");
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setNewValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_PropertyNameExactPhrase() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("NameOfApplication");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setExactPhrase(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("microsoft word office");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_PropertyNameRegex() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("^NameOfApp.*");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setIsRegex(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("new value");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_PropertyValue() throws ApiException {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		ValueOptions valueOptions = new ValueOptions();
		valueOptions.setValue("Microsoft Office Word");
		valueOptions.setType("string");
		searchCriteria.setValueOptions(valueOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("new value");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		SetResult result = metadataApi.set(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getSetCount() > 0);
	}

	@Test
	public void SetApiTest_WrongTypeForTag() {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("true");
		property.setType("boolean");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		try {
			metadataApi.set(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("There are no changes in metadata.", ex.getMessage());
		}
	}

	@Test
	public void SetApiTest_ValueFormatException() {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Created");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("value");
		property.setType("boolean");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		try {
			metadataApi.set(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
		}
	}

	@Test
	public void SetApiTest_DocumentProtectedException() {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Creator");
		tag.setCategory("Person");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("NewAuthor");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		try {
			metadataApi.set(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'documents\\sample-with-password.docx' is protected.", ex.getMessage());
		}
	}

	@Test
	public void SetApiTest_UnsupportedFormat() {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Creator");
		tag.setCategory("Person");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("NewAuthor");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		try {
			metadataApi.set(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'files\\sample.json' has type which is not currently supported.",
					ex.getMessage());
		}
	}

	@Test
	public void SetApiTest_FileNotFound() {
		// Arrange
		SetOptions options = new SetOptions();
		ArrayList<SetProperty> properties = new ArrayList<SetProperty>();
		SetProperty property = new SetProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Creator");
		tag.setCategory("Person");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setNewValue("NewAuthor");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		SetRequest request = new SetRequest(options);

		// Act & Assert
		try {
			metadataApi.set(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}
}
