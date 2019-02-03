package com.tomaszoboza.filemanager;


import com.tomaszoboza.filemanager.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.print.Doc;
import java.util.Date;

@SpringBootApplication
public class FilemanagerApplication implements ApplicationRunner {

    @Autowired
    UserRepositiory userRepositiory;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    FileToBlob fileToBlob;

    @Autowired
    DocumentRepository docrepository;


    public static void main(String[] args) {
        SpringApplication.run(FilemanagerApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setEnabled(1);
        user.setId(1L);
        user.setPassword("haslo");
        user.setRole(Role.ADMIN);
        user.setUsername("tom");

        userRepositiory.save(user);

        User user2 = userRepositiory.findAll().get(0);
        System.out.println(user2);

        byte[] fileToInsert = fileToBlob.convertFileToBlob("E://docforbase.txt");
        Document doc1 = new
                Document("Document 1", new Date(),"Opis dokumentu 1","1.0.0",fileToInsert);

        docrepository.save(doc1);
        Document docgrabbed = docrepository.getByDocName("Document 1");
        System.out.println(docgrabbed);
    }
}

//  $2a$10$HghGDyzTtg5A3GhpyzRxa.NuOY2lpfa.9jYkg6VAJkCNpVlXN1myq