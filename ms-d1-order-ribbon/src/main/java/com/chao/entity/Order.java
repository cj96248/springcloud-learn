package com.chao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    /**
     * 订单ID
     */
    private String id;
    /**
     * 订单中的商品，假设一个订单中只能包含一种商品
     */
    private Product item;
    /**
     * 订单中商品的数量
     */
    private Integer amount;
}
