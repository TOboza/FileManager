package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.User;
import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


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

    @RequestMapping("/register")
    private String showregister() {
        return "register";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    private String acceptregister(@RequestParam("username") String username,
                                  @RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  @RequestParam("passwordR") String passwordR) {
//        if (username.isEmpty()) {
//            return "redirect:register/{msg_username_empty}";
//        }else
//            if (email.isEmpty()){
//                return"redirect:register/{msg_email_empty}";
//            }else


        return "redirect:index";
    }

//    @RequestMapping(value = "/adminview/userlist", method = RequestMethod.GET)
//    private String showUseerList() {
//
//        List<User> lista = new ArrayList<User>();
//        lista = userRepository.findAll();
//
//    }
}
