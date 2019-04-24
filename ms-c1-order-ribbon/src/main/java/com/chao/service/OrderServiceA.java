package com.chao.service;

import com.chao.entity.Order;
import com.chao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceA {

    @Autowired
    private RestTemplate restTemplate;

    public Order create(Integer id, Integer amount){
        String url = "http://localhost:10001/product/"+id;
        Product p = restTemplate.getForObject(url, Product.class);
        return new Order(UUID.randomUUID().toString(), p, amount);
    }
}
