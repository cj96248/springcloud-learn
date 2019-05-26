package com.chao.controller;

import com.chao.entity.Order;
import com.chao.entity.Product;
import com.chao.service.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-feign")
public class OrderFeignController {

    @Autowired
    private OrderFeignService orderFeignService;

    @RequestMapping("/create")
    public Order add(Integer productId, Integer amount){
        return orderFeignService.create(productId, amount);
    }

    @GetMapping("/product/list")
    public List<Product> list(){
        return orderFeignService.findAll();
    }

    @GetMapping("/product/ping")
    public String pingProduct(){
        return orderFeignService.hello();
    }

}
