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

import com.groupdocs.cloud.metadata.client.ApiException;
import com.groupdocs.cloud.metadata.model.requests.*;
import com.groupdocs.cloud.metadata.model.*;

import org.junit.Test;

public class MetadataInfoApiTests extends BaseApiTest {

	@Test
	public void InfoApiTest_Slides() throws ApiException {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Pptx.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		InfoResult result = infoApi.getInfo(request);

		assertNotNull(result);
		assertEquals("PRESENTATION", result.getFileType().getFileFormat().toUpperCase());
		assertEquals(Integer.valueOf(1), result.getPageCount());
	}

	@Test
	public void InfoApiTest_Xlsx() throws ApiException {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		InfoResult result = infoApi.getInfo(request);

		assertNotNull(result);
		assertEquals("APPLICATION/VND.OPENXMLFORMATS-OFFICEDOCUMENT.SPREADSHEETML.SHEET",
				result.getFileType().getMimeType().toUpperCase());
		assertEquals(Integer.valueOf(3), result.getPageCount());
	}

	@Test
	public void InfoApiTest_Words() throws ApiException {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Docx.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		InfoResult result = infoApi.getInfo(request);

		assertNotNull(result);
		assertEquals("APPLICATION/VND.OPENXMLFORMATS-OFFICEDOCUMENT.WORDPROCESSINGML.DOCUMENT",
				result.getFileType().getMimeType().toUpperCase());
		assertEquals(Integer.valueOf(1), result.getPageCount());
	}

	@Test
	public void InfoApiTest_Jpeg() throws ApiException {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Jpg.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		InfoResult result = infoApi.getInfo(request);

		assertNotNull(result);
		assertEquals("IMAGE/JPEG", result.getFileType().getMimeType().toUpperCase());
		assertEquals(Integer.valueOf(1), result.getPageCount());
	}

	@Test
	public void InfoApiTest_Pdf() throws ApiException {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Pdf.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		InfoResult result = infoApi.getInfo(request);

		assertNotNull(result);
		assertEquals("APPLICATION/PDF", result.getFileType().getMimeType().toUpperCase());
		assertEquals(Integer.valueOf(5), result.getPageCount());
	}

	@Test
	public void InfoApiTest_FileNotFoundResult() {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.NotExist.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		try {
			infoApi.getInfo(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
		}
	}

	@Test
	public void InfoApiTest_Not_Supported() {
		// Arrange
		InfoOptions options = new InfoOptions();
		options.setFileInfo(TestFiles.Json.ToFileInfo());
		GetInfoRequest request = new GetInfoRequest(options);

		// Act & Assert
		try {
			infoApi.getInfo(request);
			fail("Expected ApiException was not thrown.");
		} catch (ApiException ex) {
			assertEquals("The file format is not supported at the moment. Basic operations are not implemented for the loaded file",
					ex.getMessage());
		}
	}
}
