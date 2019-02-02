package com.tomaszoboza.filemanager.Repositories;

import com.tomaszoboza.filemanager.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFromDatabase extends JpaRepository<User, Long> {

//    @Query("select password from users where username=?1")
//    String getPasswordByUsername(String username);
}

