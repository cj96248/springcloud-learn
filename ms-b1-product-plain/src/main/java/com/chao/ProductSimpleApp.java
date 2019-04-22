package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka Client
 * 最简单的商品模块：不会有任何逻辑代码，只包含基本配置，Eureka Server处于高可用状态下
 * Port : 10001
 */
@SpringBootApplication
public class ProductSimpleApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProductSimpleApp.class, args);
    }
}

