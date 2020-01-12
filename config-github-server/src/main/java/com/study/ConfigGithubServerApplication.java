package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * EurekaServer spring-cloud注册中心
 *
 * @author joker
 * @date 2020/1/12 12:48
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigGithubServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGithubServerApplication.class, args);
    }
}
