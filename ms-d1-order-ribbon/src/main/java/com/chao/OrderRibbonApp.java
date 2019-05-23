package com.chao;

import com.chao.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 服务消费者
 * 简易的订单模块
 * Port : 100010
 */

@SpringBootConfiguration
@EnableAutoConfiguration
@RibbonClient(name="client-c", configuration = MyRibbonConfig.class)
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyRibbonConfig.class)})
public class OrderRibbonApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderRibbonApp.class, args);
    }
}

