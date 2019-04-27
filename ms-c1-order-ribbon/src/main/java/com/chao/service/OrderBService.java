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
public class OrderBService {

    @Autowired
    private RestTemplate ribbonRestTemplate;

    /**
     * 生成一个订单
     * @param id
     * @param amount
     */
    public Order create(Integer id, Integer amount){
        String url = "http://product-service/product/"+id;
        Product p = ribbonRestTemplate.getForObject(url, Product.class);
        return new Order(UUID.randomUUID().toString(), p, amount);
    }

    /**
     * 查看所有可以购买的商品
     */
    public List<Product> findAll(){
        String url = "http://product-service/product/list";
        Product[] p = ribbonRestTemplate.getForObject(url, Product[].class);
        return Arrays.asList(p);
    }

    /**
     * 为了测试是否可以和product-service链接
     * @return
     */
    public String hello() {
        String url = "http://PRODUCT-SERVICE/product/ping";
        return ribbonRestTemplate.getForObject(url,String.class);
    }
}
