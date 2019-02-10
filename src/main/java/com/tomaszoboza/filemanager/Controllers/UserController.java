package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class UserController {

    @Autowired
    AuthSuccessHandler ash;

    @Autowired
    UserRepository userRepository;

//    @RequestMapping(value = "/admview", method = RequestMethod.POST)
//    private String acceptlogin(@RequestParam("username") String username,
//                               @RequestParam("password") String password) {
//
//        return "redirect:admview";
//    }

    @RequestMapping("/")
    private String showLogin() {
        return "index";
    }

    @RequestMapping("/index")
    private String showindex() {
        return "index";
    }

    @RequestMapping(value = "/view")
    private String acceptLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password) {

       return "redirect:view";
    }


    @RequestMapping("/admview")
    private String showadmview(Authentication authentication) {
        return "admview";
    }

    @RequestMapping("/modview")
    private String showmodview(Authentication authentication) {
        return "modview";
    }

    @RequestMapping("/userview")
    private String showuserview(Authentication authentication) {
        return "userview";
    }

    @RequestMapping("/public")
    private String showpublic(Authentication authentication) {
        System.out.println(authentication.getDetails());
        authentication.getAuthorities().forEach(e -> System.out.println(e.toString()));
        return "public";
    }

    @RequestMapping("/somewhere")
    private String showsomwhere(Authentication authentication) {

        System.out.println(authentication.getDetails());
        System.out.println(authentication.getAuthorities().toString());

        return "somewhere";
    }



    @RequestMapping("/register")
    private String showregister() {
        return "register";
    }

//    @RequestMapping(value = "/index", method = RequestMethod.POST)
//    private String acceptregister(@RequestParam("username") String username,
//                                  @RequestParam("email") String email,
//                                  @RequestParam("password") String password,
//                                  @RequestParam("passwordR") String passwordR) {
//        if (username.isEmpty()) {
//            return "redirect:register/{msg_username_empty}";
//        }else
//            if (email.isEmpty()){
//                return"redirect:register/{msg_email_empty}";
//            }else
//
//
//        return "redirect:index";
//    }

//    @RequestMapping(value = "/adminview/userlist", method = RequestMethod.GET)
//    private String showUseerList() {
//
//        List<User> lista = new ArrayList<User>();
//        lista = userRepository.findAll();
//        Model model =  model().addAttribute(lista);
//    }
}
