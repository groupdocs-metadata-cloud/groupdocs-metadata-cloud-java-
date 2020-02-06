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

import java.util.ArrayList;

public class TestFiles {    
    public static TestFile PasswordProtected = new TestFile("sample-with-password.docx", "documents\\");    
    public static TestFile Docx = new TestFile("input.docx", "documents\\");
    public static TestFile Doc = new TestFile("input.doc", "documents\\");
    public static TestFile Pdf = new TestFile("input.pdf", "documents\\");
    public static TestFile Pptx = new TestFile("input.pptx", "documents\\");
    public static TestFile Ppt = new TestFile("input.ppt", "documents\\");
    public static TestFile Xlsx = new TestFile("input.xlsx", "documents\\");
    public static TestFile Xls = new TestFile("input.xls", "documents\\");
    public static TestFile Jpg = new TestFile("input.jpg", "images\\");
    public static TestFile Json = new TestFile("sample.json", "files\\");
    public static TestFile Psd = new TestFile("iptc.psd", "files\\");
    public static TestFile NotExist = new TestFile("folder\\file-not-exist.pdf", "");

    public static ArrayList<TestFile> GetList() {

        ArrayList<TestFile> files = new ArrayList<TestFile>();
        files.add(PasswordProtected);
        files.add(Docx);
        files.add(Doc);
        files.add(Pdf);
        files.add(Pptx);
        files.add(Ppt);
        files.add(Xlsx);
        files.add(Xls);
        files.add(Jpg);
        files.add(Json);
        files.add(Psd);
        return files;
    }
}