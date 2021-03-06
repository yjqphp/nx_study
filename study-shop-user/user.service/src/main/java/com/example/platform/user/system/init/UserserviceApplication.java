package com.example.platform.user.system.init;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuan
 */
@EnableApolloConfig({"application"})
@EnableDubbo
@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args){
            SpringApplication.run(UserserviceApplication.class,args);
    }
}
