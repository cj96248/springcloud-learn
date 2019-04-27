package com.chao.controller;

import com.chao.entity.Order;
import com.chao.entity.Product;
import com.chao.service.OrderAService;
import com.chao.service.OrderBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-b")
public class OrderBController {

    @Autowired
    private OrderBService orderBService;

    @RequestMapping("/create")
    public Order add(Integer productId, Integer amount){
        return orderBService.create(productId, amount);
    }

    @GetMapping("/product/list")
    public List<Product> list(){
        return orderBService.findAll();
    }

    @GetMapping("/product/ping")
    public String pingProduct(){
        return orderBService.hello();
    }

}
