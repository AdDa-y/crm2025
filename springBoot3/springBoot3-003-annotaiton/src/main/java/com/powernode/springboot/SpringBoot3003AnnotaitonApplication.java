package com.powernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 当前类被springBootApplication标注，是该项目的入口程序类
 * main是入口
 */
@SpringBootApplication
public class SpringBoot3003AnnotaitonApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBoot3003AnnotaitonApplication.class, args);
        Object bean = run.getBean("sqlSessionFactory");
        System.out.println(bean);
    }

}
