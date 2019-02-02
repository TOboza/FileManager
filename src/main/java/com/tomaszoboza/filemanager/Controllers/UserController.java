package com.tomaszoboza.filemanager.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {



    @RequestMapping(value = "/admview", method = RequestMethod.POST)
    private String acceptlogin(@RequestParam("username") String username,
                               @RequestParam("password") String password) {

        return "redirect:admview";
    }

    @RequestMapping("/")
    private String showLogin() {
        return "index";
    }

    @RequestMapping("/index")
    private String showindex() {
        return "index";
    }

    @RequestMapping("/admview")
    private String showadmview() {
        return "admview";
    }

    @RequestMapping("/modview")
    private String showmodview() {
        return "modview";
    }

    @RequestMapping("/userview")
    private String showuserview() {
        return "userview";
    }

    @RequestMapping("/public")
    private String showpublic(Authentication authentication) {
        return "public";
    }

    @RequestMapping("/somewhere")
    private String showsomwhere() {
        return "somewhere";
    }



}
