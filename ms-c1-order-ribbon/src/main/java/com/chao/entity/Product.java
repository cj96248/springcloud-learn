package com.chao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Product {
    /**
     * 商品ID
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private double price;
}
