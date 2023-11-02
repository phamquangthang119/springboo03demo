package com.example.demospringboot03.payload.request;

import java.util.ArrayList;
import java.util.List;

public class StudentRequest {
    private String name;
    private int age;
    private List<StudentRequest> st;

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

    public StudentRequest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
