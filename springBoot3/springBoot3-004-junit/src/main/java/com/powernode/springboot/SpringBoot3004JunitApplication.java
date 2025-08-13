package com.powernode.springboot;

import com.powernode.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3004JunitApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBoot3004JunitApplication.class, args);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.findUser());
    }

}
