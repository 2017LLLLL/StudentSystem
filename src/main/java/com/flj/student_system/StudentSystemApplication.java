package com.flj.student_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.flj.student_system.dao")
public class StudentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSystemApplication.class, args);
    }

}
