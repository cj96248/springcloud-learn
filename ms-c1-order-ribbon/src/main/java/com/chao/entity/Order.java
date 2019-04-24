package com.chao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Order {
    private String id;
    private Product item;
    private Integer amount;
}
