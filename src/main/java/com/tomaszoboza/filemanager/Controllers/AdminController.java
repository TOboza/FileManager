package com.tomaszoboza.filemanager.Controllers;

import com.tomaszoboza.filemanager.Model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admview")
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    private String showadmview() {
        return "admview";
    }

    @RequestMapping("/manage_accounts")
    private String manageAccounts() {
        return "manage_accounts";

    }

    @RequestMapping("/manage_accounts/accounts_view")
    private String showAccounts() {
        return "accounts_view";

    }
}