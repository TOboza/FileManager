package com.tomaszoboza.filemanager.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AuthSuccessHandler{


     public String determineTargetUrl(Authentication auth) {

        String whoRU = auth.getAuthorities().toString();
        String landingPage;

        if (whoRU.equals("[USER]")) {
            landingPage = "userview";
        } else if (whoRU.equals("[MODERATOR]")) {
            landingPage = "modview";
        } else if (whoRU.equals("[ADMIN]")) {
            landingPage = "admview";
        } else landingPage = "public";

        return landingPage;

    }

}



