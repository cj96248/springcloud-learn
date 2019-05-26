package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 * 简易的订单模块
 * 使用Feign 服务间调用
 * Port : 100020
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderFeignApp.class, args);
    }
}

