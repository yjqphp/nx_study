package com.example.yewu.syetem.init;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuan
 */
@EnableDubbo
@SpringBootApplication
public class ListlogicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ListlogicApplication.class,args);
    }
}
