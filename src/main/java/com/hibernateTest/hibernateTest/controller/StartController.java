package com.hibernateTest.hibernateTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@RestController
@RequestMapping
public class StartController {

    @GetMapping
    public RedirectView mainPage(){
        return new RedirectView("/login.html");
    }

}
