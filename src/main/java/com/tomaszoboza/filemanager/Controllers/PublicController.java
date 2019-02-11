package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class PublicController {

    @Autowired
    AuthSuccessHandler ash;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    private String showLogin() {
        return "index";
    }

    @RequestMapping("/index")
    private String showindex(Authentication authentication) {
         return "index";
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    private String acceptLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                                Authentication authentication) {
        return "redirect:view";
    }

    @RequestMapping("/view")
    private String showview(Authentication authentication) {
        return ash.determineTargetUrl(authentication);
    }


    @RequestMapping("/public")
    private String showpublic() {
        return "public";
    }

    @RequestMapping("/somewhere")
    private String showsomwhere(Authentication authentication) {
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
@RequestMapping(value = "/register", method = RequestMethod.POST)
private String acceptregister(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("passwordR") String passwordR,
                              @RequestParam("email") String email,
                              Authentication authentication) {
    if (username.isEmpty()) {
            return "redirect:register/{msg_username_empty}";
        }else
            if (email.isEmpty()){
                return"redirect:register/{msg_email_empty}";
            }else

    return "redirect:view";
}
}
