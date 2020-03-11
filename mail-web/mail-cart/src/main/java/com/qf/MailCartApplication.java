package com.qf;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDubbo
public class MailCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailCartApplication.class, args);
    }
}
