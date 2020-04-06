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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.groupdocs.cloud.metadata.client.ApiException;
import com.groupdocs.cloud.metadata.model.requests.*;
import com.groupdocs.cloud.metadata.model.*;

import org.junit.Test;

public class MetadataAddApiTests extends BaseApiTest {

	@Test
	public void AddApiTest() throws ApiException {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Printed");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		AddResult result = metadataApi.add(request);

		assertNotNull(result);
		assertTrue(result.getAddedCount() > 0);
	}

	@Test
	public void AddApiTest_PossibleTagName() throws ApiException {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		tagOptions.setPossibleName("timeprinted");
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		AddResult result = metadataApi.add(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getAddedCount() > 0);
	}

	@Test
	public void AddApiTest_PropertyName() throws ApiException {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("print");
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Doc.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		AddResult result = metadataApi.add(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getAddedCount() > 0);
	}

	@Test
	public void AddApiTest_PropertyNameExactPhrase() throws ApiException {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("Lastprinted");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setExactPhrase(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));;
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Doc.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		AddResult result = metadataApi.add(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getAddedCount() > 0);
	}

	@Test
	public void AddApiTest_PropertyNameRegex() throws ApiException {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("^.*print.*");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setIsRegex(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Doc.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		AddResult result = metadataApi.add(request);

		assertNotNull(result);
		assertNotNull(result.getPath());
		assertNotNull(result.getUrl());
		assertTrue(result.getAddedCount() > 0);
	}

	@Test
	public void AddApiTestWrongValueTypeForTag() {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Printed");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setValue("new value");
		property.setType("string");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Doc.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		try {
			metadataApi.add(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("There are no changes in metadata.", ex.getMessage());
		}
	}

	@Test
	public void AddApiTest_ValueFormatException() {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		NameOptions nameOptions = new NameOptions();
		nameOptions.setValue("^.*print.*");
		MatchOptions matchOptions = new MatchOptions();
		matchOptions.setIsRegex(true);
		nameOptions.setMatchOptions(matchOptions);
		searchCriteria.setNameOptions(nameOptions);
		property.setSearchCriteria(searchCriteria);
		property.setValue("value");
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Jpg.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		try {
			metadataApi.add(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
		}
	}

	@Test
	public void AddApiTest_DocumentProtectedException() {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Printed");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		try {
			metadataApi.add(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'documents\\sample-with-password.docx' is protected.", ex.getMessage());
		}
	}

	@Test
	public void AddApiTest_UnsupportedFormat() {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteriaWithoutValue searchCriteria = new SearchCriteriaWithoutValue();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Printed");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		property.setValue(dateFormat.format(date));
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		try {
			metadataApi.add(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The specified file 'files\\sample.json' has type which is not currently supported.",
					ex.getMessage());
		}
	}

	@Test
	public void AddApiTest_FileNotFound() {
		// Arrange
		AddOptions options = new AddOptions();
		ArrayList<AddProperty> properties = new ArrayList<AddProperty>();
		AddProperty property = new AddProperty();
		SearchCriteria searchCriteria = new SearchCriteria();
		TagOptions tagOptions = new TagOptions();
		Tag tag = new Tag();
		tag.setName("Printed");
		tag.setCategory("Time");
		tagOptions.setExactTag(tag);
		searchCriteria.setTagOptions(tagOptions);
		property.setSearchCriteria(searchCriteria);
		property.setValue("new value");
		property.setType("datetime");
		properties.add(property);
		options.setProperties(properties);
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		AddRequest request = new AddRequest(options);

		// Act & Assert
		try {
			metadataApi.add(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}
}
