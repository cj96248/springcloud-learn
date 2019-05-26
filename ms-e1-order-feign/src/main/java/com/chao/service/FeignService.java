package com.chao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="product-service")
public interface FeignService {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    String sayHi();
}
