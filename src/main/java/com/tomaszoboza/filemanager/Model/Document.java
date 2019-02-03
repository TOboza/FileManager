package com.tomaszoboza.filemanager.Model;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
public class Document {
    @NotNull
    @GeneratedValue
    @Id
    private Long id;

    @NotEmpty
    private String docName;

    @NotNull
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationTime;
    private String description;
    private String revision;

    @Column(name = "file", columnDefinition = "BLOB", nullable = false)
    private byte[] file;

    public Document() {
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Document(@NotEmpty String docName, @NotNull Date creationTime, String description, String revision, byte[] file) {
        this.docName = docName;
        this.creationTime = creationTime;
        this.description = description;
        this.revision = revision;
        this.file = file;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", docName='" + docName + '\'' +
                ", creationTime=" + creationTime +
                ", description='" + description + '\'' +
                ", revision='" + revision + '\'' +
                '}';
    }
}
