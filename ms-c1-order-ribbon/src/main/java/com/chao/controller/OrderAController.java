package com.chao.controller;

import com.chao.entity.Order;
import com.chao.entity.Product;
import com.chao.service.OrderAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-a")
public class OrderAController {

    @Autowired
    private OrderAService orderServiceA;

    @RequestMapping("/create")
    public Order add(Integer productId, Integer amount){
        return orderServiceA.create(productId, amount);
    }

    @GetMapping("/product/list")
    public List<Product> list(){
        return orderServiceA.findAll();
    }

    @GetMapping("/product/ping")
    public String pingProduct(){
        return orderServiceA.hello();
    }

}
