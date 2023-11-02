package com.example.demospringboot03.controller;

import com.example.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // Tham so truyen tren trinh duyet (get) : @RequestParam
    // Tham so truyen` ngam` (ngoài get) @RequestParam
    // Tham số đóng vai trò như là 1 đường dẫn : @PathVariable
    // Tham số là đối tượng: @RequestBody
    /*
       + BadRequest:
       - không truyền tham số,
       - có truyền tham số nhưng sai tên tham số,
       - đúng tên tham số nhưng sai kiểu dữ liệu

public String hello(@RequestParam (required = false)String hoten) : required = false : truyền hay ko truyền đều đc
     */

    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi) {
        return "Hello Spring boot" + hoten + " - tuoi : " + tuoi;
    }

    //form-data truyen ngam chonj form-data: tham số truyền ngầm và truyen file
    //x-ww-form: ko hỗ tro tuyen filex
    // raw : chuyen len 1 doi tuong

    //responsetntiy: can thiep status code khi tra ra
    // responseEntity<?> : tra? ve gi cung dc

    // khi chay api chay ra kq cuoi cung het thi status luon luon la ok
    // loi 500 xay ra 2 ben
    @PostMapping("/cybersofts")
    public ResponseEntity<String> helloCybersoft(@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>("Hello Spring Cybersoft" + loginRequest.getUsername() + " - " + loginRequest.getPassword(), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id) {
        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }
}