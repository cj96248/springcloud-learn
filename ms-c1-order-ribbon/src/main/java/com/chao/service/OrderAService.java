package com.chao.service;

import com.chao.entity.Order;
import com.chao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class OrderAService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 生成一个订单
     * @param id
     * @param amount
     */
    public Order create(Integer id, Integer amount){
        String url = "http://localhost:10001/product/"+id;
        Product p = restTemplate.getForObject(url, Product.class);
        return new Order(UUID.randomUUID().toString(), p, amount);
    }

    /**
     * 查看所有可以购买的商品
     */
    public List<Product> findAll(){
        String url = "http://localhost:10001/product/list";
        Product[] p = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(p);
    }
}
