package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@MapperScan("com.example.demo.repository.mybatis") // MyBatis 用
@EnableJpaRepositories("com.example.demo.repository.jpa") // JPA 用
public class TrainingspringbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingspringbApplication.class, args);
	}

}