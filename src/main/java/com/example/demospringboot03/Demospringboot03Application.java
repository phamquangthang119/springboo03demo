package com.example.demospringboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Neeus muốn tạo ra class gán sẵn giá trị và sử dụng lại classs này cho các class khác
thì phải đưa class này lưu trữ trên container (IOC)

@Bean, @Service, @Component, @Repository

 */
@SpringBootApplication
public class Demospringboot03Application {

	public static void main(String[] args) {
		SpringApplication.run(Demospringboot03Application.class, args);
	}

}
