package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * EurekaServer spring-cloud注册中心
 *
 * @author joker
 * @date 2020/1/12 12:48
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
