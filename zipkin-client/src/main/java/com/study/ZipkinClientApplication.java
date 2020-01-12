package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EurekaServer spring-cloud注册中心
 *
 * @author joker
 * @date 2020/1/12 12:48
 */
@SpringBootApplication
public class ZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }
}
