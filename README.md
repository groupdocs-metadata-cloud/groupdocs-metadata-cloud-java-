![](https://img.shields.io/badge/api-v2.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/groupdocs-metadata-cloud/groupdocs-metadata-cloud-java)](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-java/blob/master/LICENSE)

# Java SDK to Manage Documents Metadata in the Cloud

[GroupDocs.Metadata Cloud SDK for Java](https://products.groupdocs.cloud/metadata/java) wraps GroupDocs.Metadata RESTful APIs so you may integrate **Document Metadata** features in your own apps with zero initial cost.

GroupDocs.Metadata Cloud API allows the developers to perform metadata manipulation operations on documents, images and other popular file formats using cURL commands or independent SDKs for .NET and Java platforms.

## Document Metadata REST API

- Extract metadata from the documents.
- Add metadata properties.
- Set metadata properties.
- Remove metadata properties.
- Obtain all supported metadata formats list.
- Integrated storage API.

Check out the [Developer's Guide](https://docs.groupdocs.cloud/metadata/developer-guide/) to know more about GroupDocs.Metadata REST API.

## Microsoft File Formats

**Microsoft Word:** DOC, DOCX, DOT, DOTX, DOCM\
**Excel:** XLS, XLSX, XLSM, XLTM\
**PowerPoint:** PPT, PPTX, POTM, POTX, PPTM, PPS, PPSX‎, PPSM‎\
**Outlook:** MSG, EML\
**OneNote:** ONE\
**Visio:** VSD, VDX, VSDX, VSS, VSX\
**Project:** MPP\

## Other Formats

**OpenDocument:** ODT, ODS\
**Portable:** PDF\
**Photoshop:** PSD\
**AutoCAD:** DWG, DXF\
**Audio:** MP3, WAV\
**Video:** AVI, MOV, QT, FLV\
**Metafiles:** EMF, WMF\
**vCard:** VCF‎, VCR\
**Image:** JPG, JPEG, JPE, JP2, PNG, GIF, TIFF, WebP, BMP, DJVU, DJV, DICOM‎\
**OpenType Fonts:** OTF, OTC, TTF, TTC\‎
**Others:** EPUB, ZIP, TORRENT, ASF\

## Get Started with GroupDocs.Metadata Cloud SDK for Java

First create an account at [GroupDocs for Cloud](https://dashboard.groupdocs.cloud/) and get your application information. Next, follow the installation steps as given below.

### Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

### Installation

Simply execute the following to install the API client library to your local Maven repository.

```shell
mvn install
```

Configure the settings of the repository and execute the following to deploy it to a remote Maven repository instead.

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

#### Maven

Add following repository and dependency to your project's POM.

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-metadata-cloud</artifactId>
    <version>20.4</version>
    <scope>compile</scope>
</dependency>
```

#### Others

First generate the JAR by executing `mvn package`, then manually install the following JARs.

* target/groupdocs-metadata-cloud-20.11.jar
* target/lib/*.jar

## Get Supported File Formats for Metadata

```java
// Get Client Id and Client Secret from https://dashboard.groupdocs.cloud
String MyClientId = "";
String MyClientSecret = "";

// Create instance of the API
Configuration configuration = new Configuration(MyClientId, MyClientSecret);
InfoApi api = new InfoApi(configuration);

FormatsResult response = api.getSupportedFileFormats();
for (Format format : response.getFormats()) {
	System.out.println(format.getFileFormat());
}
```

## GroupDocs.Metadata Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Android |
|---|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-dotnet) | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-java) | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-php) | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-python) | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-ruby)  | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-node) | [GitHub](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-android) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Metadata-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-metadata-cloud) |  |  |   |  |  |

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/metadata/net) | [Documentation](https://docs.groupdocs.cloud/metadata/) | [Live Demo](https://products.groupdocs.app/metadata/total) | [API Reference](https://apireference.groupdocs.cloud/metadata/) | [Code Samples](https://github.com/groupdocs-metadata-cloud/groupdocs-metadata-cloud-dotnet-samples) | [Blog](https://blog.groupdocs.cloud/category/metadata/) | [Free Support](https://forum.groupdocs.cloud/c/metadata) | [Free Trial](https://dashboard.groupdocs.cloud)
