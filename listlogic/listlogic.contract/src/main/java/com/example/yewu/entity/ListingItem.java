package com.example.yewu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuan
 */
@Data
public class ListingItem implements Serializable {

    //商品编号
    private Long infoId;

    //商品标题
    private String title;

    //商品描述
    private String describe;

    //商品图片url
    private String images;

    //发布者编号
    private Long uid;

    //发布者昵称
    private String nickName;

}
