package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供者
 * 简易的商品模块：包含一个商品信息服务
 * Port : 10001
 */
@SpringBootApplication
public class ProductProducerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProductProducerApp.class, args);
    }
}

