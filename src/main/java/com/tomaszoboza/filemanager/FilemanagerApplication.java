package com.tomaszoboza.filemanager;

import com.tomaszoboza.filemanager.Repositories.UserFromDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class FilemanagerApplication implements ApplicationRunner {

    @Autowired
    UserFromDatabase userFromDatabase;

    public static void main(String[] args) {
        SpringApplication.run(FilemanagerApplication.class, args);



    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = userFromDatabase.findAll().get(0);
        System.out.println(user.getUsername());


    }
}

