package com.example.simpledictionary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DictionaryController {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }
}

