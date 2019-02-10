package com.tomaszoboza.filemanager.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User {


    @GeneratedValue
    @Id
    private Long id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Authorities authorities;
    @NotNull
    private Integer enabled;

    @NotEmpty
    private String email;

    public User() {
    }


    public User(@NotEmpty String username, @NotEmpty String password, @NotNull Authorities authorities, @NotEmpty String email, @NotNull Integer enabled) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.enabled = enabled;
        this.email = email;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authorities getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authorities authorities) {
        this.authorities = authorities;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                ", enabled=" + enabled +
                ", email='" + email + '\'' +
                '}';
    }
}
