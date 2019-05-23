package com.chao.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableEurekaClient
public class CustomConfig {

    @Bean
    @LoadBalanced
    public RestTemplate ribbonRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule ribbonRule(){
//        return new WeightedResponseTimeRule();
//    }


}
