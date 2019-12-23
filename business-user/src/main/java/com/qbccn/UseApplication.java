package com.qbccn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qbccn.mapper")
public class UseApplication {
    public static void main(String[] args) {
        SpringApplication.run(UseApplication.class, args);
    }
}
