package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 * 简易的订单模块
 * 理解 Hystrix 的作用
 * Port : 10060
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class OrderHystrixApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderHystrixApp.class, args);
    }
}

