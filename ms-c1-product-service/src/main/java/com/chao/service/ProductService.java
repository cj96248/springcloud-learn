package com.chao.service;

import com.chao.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = Arrays.asList(new Product(0,"phone", 4999),new Product(1,"glass", 23.5), new Product(2, "clothes", 234.99));

    public Product getById(Integer id){
        return products.get(id);
    }

    public List<Product> getAll(){
        return products;
    }
}
