package com.tomaszoboza.filemanager.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {
    void deleteByDocName(String docName);
    void deleteById(Long id);
    Document getByCreationTime(Date creationDate);
    Document getByDocName(String docName);
    Document getByDescriptionContaining(String descriptionPart);
    List<Document> getByDocNameContaining(String docNamePart);
    List<Document> getAllByCreationTimeBetween(Date startingDate, Date stopDate);
    List<Document> getAllByCreationTime(Date creationDate);

}
