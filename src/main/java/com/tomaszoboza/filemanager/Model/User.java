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
    private Role role;
    @NotNull
    private Integer enabled;

    public User() {
    }

    public User(@NotEmpty String username, @NotEmpty String password, @NotNull Role role, @NotNull Integer enabled) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", enabled=" + enabled +
                '}';
    }
}
