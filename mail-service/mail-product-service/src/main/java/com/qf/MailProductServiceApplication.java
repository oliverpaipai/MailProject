package com.qf;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.qf.snow")
public class MailProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailProductServiceApplication.class, args);
    }

}
