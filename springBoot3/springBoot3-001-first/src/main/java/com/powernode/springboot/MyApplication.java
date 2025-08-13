package com.powernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:MyApplication
 * Description:
 * Author:dwj@
 * Datetime:2025/8/217:30
 * version:1.0
 */
//所有的springBoot应用的主入口程序都必须使用
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
