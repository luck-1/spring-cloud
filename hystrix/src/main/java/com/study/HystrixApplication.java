package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EurekaServer spring-cloud注册中心
 *
 * @author joker
 * @date 2020/1/12 12:48
 */
@EnableFeignClients
@SpringBootApplication
// 声明启用数据监控
@EnableCircuitBreaker
// 声明启用可视化数据监控
@EnableHystrixDashboard
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
