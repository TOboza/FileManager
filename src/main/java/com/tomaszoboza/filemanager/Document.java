package com.tomaszoboza.filemanager;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.sql.Blob;
import java.sql.Date;


@Entity
public class Document {
    @NotEmpty
    @GeneratedValue
    @Id
    private Long id;

    @NotEmpty
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationTime;
    private String description;
    private String revision;
    private Blob file;

    public Document() {
    }

    public Document(@NotEmpty Date creationTime, String description, String revision, Blob file) {
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

    public Blob getFile() {
        return file;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", creationTime=" + creationTime +
                ", description='" + description + '\'' +
                ", revision='" + revision + '\'' + '}';
    }
}
