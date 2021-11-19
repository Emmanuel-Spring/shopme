package com.talentyco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/principal")
    public String goHome(){

        return "home";
    }


}
