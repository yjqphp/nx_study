package com.demo.platform.user.contract;

import com.demo.platform.user.entity.User;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author yuan
 * 用户service
 */
public interface IUserService {

    /**
     * 获取用户列表
     * @param uids
     * @return
     */
    List<User> getUserInfos(List<Long> uids);

    /**
     * 获取用户基本信息
     * @param uid
     * @return
     */
    User getUserInfo(Long uid);

    /**
     * 测试demo
     * @param name
     * @return
     */
    CompletableFuture<String> sayHello(String name);
}
