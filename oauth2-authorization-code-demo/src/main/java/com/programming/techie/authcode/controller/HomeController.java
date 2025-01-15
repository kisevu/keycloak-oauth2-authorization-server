package com.programming.techie.authcode.controller;/*
*
@author ameda
@project spring-security-oauth2-keycloak-demo
*
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
