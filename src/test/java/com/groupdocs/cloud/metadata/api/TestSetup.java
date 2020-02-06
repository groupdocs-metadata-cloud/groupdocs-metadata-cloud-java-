package com.groupdocs.cloud.metadata.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AuthApiTests.class,
    FormatsApiTests.class,
    StorageApiTests.class,
    FolderApiTests.class,
    FileApiTests.class,
    MetadataInfoApiTests.class,
    MetadataAddApiTests.class,
    MetadataExtractApiTests.class,
    MetadataRemoveApiTests.class,
    MetadataSetApiTests.class,
    MetadataTagsApiTests.class
})

public class TestSetup {
    

}
