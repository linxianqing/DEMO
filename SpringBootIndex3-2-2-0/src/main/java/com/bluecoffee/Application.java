package com.bluecoffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by qianlong on 16/10/2.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("------------WebApplication is start---------------");
        SpringApplication.run(Application.class, args);
    }
}
