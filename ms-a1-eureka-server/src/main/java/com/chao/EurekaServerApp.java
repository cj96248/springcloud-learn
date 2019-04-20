package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka Server
 * Port : 8761
 */
@SpringBootApplication
public class EurekaServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApp.class, args);
    }
}
