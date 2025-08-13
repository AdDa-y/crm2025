package com.powernode.springboot;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;
import java.util.zip.ZipOutputStream;

@MapperScan (basePackages = "com.powernode.springboot.repository")
@SpringBootApplication
public class SpringBoot3008GeneratorApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringBoot3008GeneratorApplication.class, args);
        VipMapper vipMapper = run.getBean(VipMapper.class);
        Vip vip = new Vip("jack","12345667","2020-22-22");
        vipMapper.insert(vip);

       Vip vip1 = vipMapper.selectByPrimaryKey(7L);
        System.out.println(vip1);


        run.close();
    }

}
