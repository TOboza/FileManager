package com.tomaszoboza.filemanager.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterValidator {

    @Autowired
    UserRepository userRepository;

    private String emailMsg;
    private String usernameMsg;
    private String passwordMsg;

    public RegisterValidator() {
    }

    public String getEmailMsg() {
        if (emailMsg != null) {
            return emailMsg;
        } else return "EmailMsg has no content";
    }

    public String getUsernameMsg() {
        if (usernameMsg != null) {
            return usernameMsg;
        } else return "UsernameMsg has no content";
    }

    public String getPasswordMsg() {
        if (passwordMsg != null) {
            return passwordMsg;
        } else return "PasswordMsg has no content";
    }

    public boolean checkEmail(String email) {
        if (email != null) {
            if (email.contains("@") && email.length() > 5 && email.contains(".")) {
                emailMsg = "Email address is valid";
                return true;
            } else {
                emailMsg = "Email address is invalid";
                return false;
            }
        }
        return false;

    }

    public boolean checkUsername(String userToCheck) {
        if (userToCheck != null) {
            if (userRepository.existsUserByUsername(userToCheck)) {
                usernameMsg = "Username already exist";
                return false;
            } else {
                usernameMsg = "Username unique";
                return true;
            }
        }
        usernameMsg = "Username empty";
        return false;
    }

    public boolean passwordCheck(String password, String passwordR) {
        if (password != null) {
            if (password.length() > 3) {
                if (password.equals(passwordR)) {
                    passwordMsg = "Password valid";
                    return true;
                }
                passwordMsg = "Your password is not matching";
                return false;
            }
            passwordMsg = "Your password is too short. Minimum 4 characters ( recommended at least 8) ";
            return false;
        }

        passwordMsg = "Password cannot be empty";
        return false;
    }

}
