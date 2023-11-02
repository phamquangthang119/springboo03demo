package com.example.demospringboot03.controller;

import com.example.demospringboot03.payload.request.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    List<StudentRequest> newStudent = new ArrayList<>();

    public StudentController(List<StudentRequest> newStudent) {
        this.newStudent = newStudent;
    }

    @PostMapping("")
    public ResponseEntity<?> CreateStudent(@RequestBody StudentRequest studentRequest) {
        newStudent.add(studentRequest);
        return new ResponseEntity<>("Create student successful.", HttpStatus.CREATED);
    }

    @PostMapping("/param")
    public ResponseEntity<?> CreateStudent1(@RequestParam String name, @RequestParam int age) {
        StudentRequest studentRequest = new StudentRequest(name, age);
        newStudent.add(studentRequest);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> CreateStudent2(@PathVariable String name, @PathVariable int age) {
        StudentRequest studentRequest = new StudentRequest(name, age);
        newStudent.add(studentRequest);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }


}
