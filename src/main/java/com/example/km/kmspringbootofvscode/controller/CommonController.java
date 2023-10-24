package com.example.km.kmspringbootofvscode.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController{
    
    @RequestMapping(value = "/")
    public String enter() {
        HashMap result = new HashMap();
        result.put("message", "안녕하세요 a             asdfafsadfsadfasdfasdfdasf");

        return "index";
    }

    @RequestMapping(value = "/api")
    public HashMap test() {
        HashMap result = new HashMap();
<<<<<<< HEAD
<<<<<<< HEAD
        result.put("message", "하이방가루~");
=======
        result.put("message", "반갑습니다.");
>>>>>>> 7d7e90974d9e989d21f90fe588ff682ba735d182
=======
        result.put("message", "안녕하세요.  aaaaaaaaaaaaaaaadasfsdafdsfadsfaaa ");
>>>>>>> acd593f7178b8356dfb5434a46538548f15790f4
        System.out.println("Hello");
        return result;
    }
}