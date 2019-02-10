package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/modview")
public class ModeratorController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    private String showmodview() {
        return "modview";
    }
}