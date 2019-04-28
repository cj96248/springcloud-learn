package com.chao.controller;

import com.chao.entity.Product;
import com.chao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product findOne(@PathVariable Integer id){
        return productService.getById(id);
    }

    @GetMapping("/list")
    public List<Product> all(){
        return productService.getAll();
    }

    /**
     * 简单测试连通性，不包括业务逻辑
     * @return
     */
    @GetMapping("/ping")
    public String hello(HttpServletRequest request){
        return "Hello, message from "+ request.getServerName()+ ":"+ request.getServerPort();
    }

}
