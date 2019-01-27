package com.tomaszoboza.filemanager.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {


    @RequestMapping(value = "/", method = RequestMethod.POST)
    private String acceptlogin(@RequestParam("username") String username,
                               @RequestParam("password") String password) {

        return "redirect:admview";
    }


    @RequestMapping("/")
    private String showLogin(){
        return "index";
    }




}
