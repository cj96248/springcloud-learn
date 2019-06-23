package com.chao.service;

import com.chao.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="product-service")
public interface FeignService {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    String sayHi();

    @RequestMapping(value = "/list")
    List<Product> list();
}
