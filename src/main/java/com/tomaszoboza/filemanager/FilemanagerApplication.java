package com.tomaszoboza.filemanager;


import com.tomaszoboza.filemanager.Configuration.WebSecurityConfig;
import com.tomaszoboza.filemanager.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class FilemanagerApplication implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    FileToBlob fileToBlob;

    @Autowired
    DocumentRepository docrepository;

    @Autowired
    WebSecurityConfig wbc;

    @Autowired
    RegisterValidator rv;

    public static void main(String[] args) {
        SpringApplication.run(FilemanagerApplication.class, args);

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {


       // System.out.println(wbc.passwordEncoder().encode("haslo"));

//        User user = new User();
//        user.setEnabled(1);
//        user.setId(3L);
//        user.setPassword(new BCryptPasswordEncoder().encode("haslo"));
//        user.setAuthorities(Authorities.USER);
//        user.setUsername("tim");
//        user.setEmail("tim@xxx.xx");
//        userRepository.save(user);

//        User user2 = new User();
//        user.setEnabled(1);
//        user.setId(2L);
//        user.setPassword(new BCryptPasswordEncoder().encode("haslo"));
//        user.setAuthorities(Authorities.MODERATOR);
//        user.setUsername("ted");
//        user.setEmail("ted@xxx.xx");
//        userRepository.save(user);

//        User user2 = userRepository.findAll().get(0);
//        System.out.println(user2);
//
//        byte[] fileToInsert = fileToBlob.convertFileToBlob("E://docforbase.txt");
//        Document doc1 = new
//                Document("Document 1", new Date(),"Opis dokumentu 1","1.0.0",fileToInsert);
//
//        docrepository.save(doc1);
//        Document docgrabbed = docrepository.getByDocName("Document 1");
//        System.out.println(docgrabbed);
        System.out.println("sprawdzenie walidatora\n\n");
        System.out.println(rv.checkEmail("tom@costam.pl"));
        System.out.println(rv.getEmailMsg());
        System.out.println(rv.passwordCheck("tomas","toma"));
        System.out.println(rv.getPasswordMsg());
        System.out.println(rv.checkUsername("ted1"));
        System.out.println(rv.getUsernameMsg());
    }
}

