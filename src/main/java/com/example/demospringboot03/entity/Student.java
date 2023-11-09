package com.example.demospringboot03.entity;

import com.example.demospringboot03.payload.request.StudentRequest;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<StudentRequest> st;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
