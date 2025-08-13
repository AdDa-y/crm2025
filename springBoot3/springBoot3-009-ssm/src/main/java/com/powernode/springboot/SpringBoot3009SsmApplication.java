package com.powernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan (basePackages = "com.powernode.springboot.repository")
@SpringBootApplication
public class SpringBoot3009SsmApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot3009SsmApplication.class, args);

    }

}
