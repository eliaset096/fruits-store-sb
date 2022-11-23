package com.semillero.fruitsstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits")
public class FruitsStoreController {
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Fruits Store";
    }



}
