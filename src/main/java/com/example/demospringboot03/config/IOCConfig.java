package com.example.demospringboot03.config;

import com.example.demospringboot03.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCConfig {

    @Bean // tao ra class va luu tru tren IOC
    public Student createStudentIOC() {
        Student student = new Student();
        student.setName("Cybersoft");
        student.setAge(21);
        return student;
    }
}
