package com.tomaszoboza.filemanager.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Repository
public interface UserRepositiory extends JpaRepository<User, Long> {

//    @Query("select password from user where username=?1")
//    String getPasswordByUsername(String username);

    User getUserByUsername(String username);

    void removeUserByUsername(String username);




}

