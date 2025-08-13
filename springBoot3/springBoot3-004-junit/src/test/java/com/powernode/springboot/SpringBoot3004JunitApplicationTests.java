package com.powernode.springboot;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootTest
class SpringBoot3004JunitApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User user = userService.findUser();
        System.out.println(user);
    }

}
