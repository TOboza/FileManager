package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userview")
public class UserController {


    @Autowired
    UserRepository userRepository;


    @RequestMapping("/")
    private String showuserview() {
        return "userview";
    }


}