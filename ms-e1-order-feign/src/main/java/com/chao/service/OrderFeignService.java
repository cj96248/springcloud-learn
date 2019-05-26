package com.chao.service;

import com.chao.entity.Order;
import com.chao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFeignService {

    @Autowired
    FeignService feignService;

    /**
     * 生成一个订单
     * @param id
     * @param amount
     */
    public Order create(Integer id, Integer amount){
        String url = "http://product-service/product/"+id;
        return null;
    }

    /**
     * 查看所有可以购买的商品
     */
    public List<Product> findAll(){
        String url = "http://product-service/product/list";
        return null;
    }

    /**
     * 为了测试是否可以和product-service链接
     * @return
     */
    public String hello() {
        String url = "http://PRODUCT-SERVICE/product/ping";
        return feignService.sayHi();
    }
}
