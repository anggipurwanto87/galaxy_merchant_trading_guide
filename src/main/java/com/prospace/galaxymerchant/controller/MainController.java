package com.prospace.galaxymerchant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public String postIndex(){
        return "result here";
    }
}