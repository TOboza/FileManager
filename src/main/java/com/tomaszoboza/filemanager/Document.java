package com.tomaszoboza.filemanager;

import java.sql.Blob;
import java.sql.Timestamp;

public class Document {

    private Long id;
    private Timestamp additionTime;
    private String description;
    private String revision;

    private Blob file;


}
