package com.example.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @Controller : dung de dinh nghia duong dan ma noi dung duong dan tra ra html
    @ResonpseBody: Giup cho @Controller co the tra ra kieu String dung de viet api

    VD: muon goi hello/cybersoft
    @RestController : ket hop cua @Controller va @ResponseBody => dung chu yeu de viet api
 */
@RestController
//restmapping : quy dinh duong dan la /hello
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Hello Spring boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft() {
        return "Hello Spring Cybersoft";
    }
}