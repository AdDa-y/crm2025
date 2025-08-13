package com.powernode.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot3005YamApplicationTests {

    @Autowired
    private  UserService01 userService01;

    @Test
    void test(){
        userService01.display();
   }
}
