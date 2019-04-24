package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务消费者
 * 简易的订单模块
 * Port : 100010
 */
@SpringBootApplication
public class OrderRibbonApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderRibbonApp.class, args);
    }
}

