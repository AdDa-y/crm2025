package com.powernode.springboot3lombok;

import com.powernode.springBoot.bean.Vip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot3LombokApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot3LombokApplication.class, args);
        Vip vip = new Vip(1000L,"ssssss","ssssss","ssssss");

        System.out.println(vip);
    }

}
