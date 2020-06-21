package com.example.platform.product.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuan
 */
@Data
public class Product implements Serializable {

    //商品id
    private Long infoId;

    //标题
    private String title;

    //商品描述图片
    private String images;

    //产品描述
    private String describe;

    //产品url
    private String url;

    //用户编号
    private Long uid;
}
