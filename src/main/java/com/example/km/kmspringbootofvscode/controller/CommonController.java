package com.example.km.kmspringbootofvscode.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController{
    
    @RequestMapping(value = "/")
    public String enter() {
        HashMap result = new HashMap();
        result.put("message", "반갑습니다.");

        return "index";
    }

    @RequestMapping(value = "/api")
    public HashMap test() {
        HashMap result = new HashMap();
        result.put("message", "반갑습니다.");
        System.out.println("Hello World");
        return result;
    }
}