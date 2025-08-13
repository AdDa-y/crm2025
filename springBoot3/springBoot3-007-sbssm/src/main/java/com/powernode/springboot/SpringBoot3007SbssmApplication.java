package com.powernode.springboot;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = {"com.powernode.springboot.repository"})
@SpringBootApplication
public class SpringBoot3007SbssmApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBoot3007SbssmApplication.class, args);
        VipService vipService = applicationContext.getBean(VipService.class);
        //保存会员
        Vip vip1 = new Vip("JACK","123455","1996-04-07");
        vipService.save(vip1);
        Vip vip2= new Vip("lucy","123455","1996-04-07");
        vipService.save(vip2);

        //查看所有会员
        vipService.findAll().forEach(System.out::println);

        applicationContext.close();
    }

}
