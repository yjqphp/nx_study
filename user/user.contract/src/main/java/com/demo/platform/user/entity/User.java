package com.demo.platform.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    //用户编号
    private Long uid;

    //手机号
    private String mobile;

    //用户昵称
    private String nickName;
}
