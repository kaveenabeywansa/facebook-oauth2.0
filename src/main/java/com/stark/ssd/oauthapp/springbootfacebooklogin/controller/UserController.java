package com.stark.ssd.oauthapp.springbootfacebooklogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public Principal getUser(Principal facebookUser) {
        // return the user object
        return facebookUser;
    }
}
