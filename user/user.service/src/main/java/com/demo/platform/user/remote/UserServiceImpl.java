package com.demo.platform.user.remote;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.platform.user.contract.IUserService;
import com.demo.platform.user.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> getUserInfos(List<Long> uids) {
        Long phone = 13020093900L;
        List<User> users = new ArrayList<>();
        for (Long uid:uids){
            User tmp = new User();
            tmp.setUid(uid);
            phone++;
            tmp.setMobile(phone.toString());
            tmp.setNickName("昵称" + uid);
        }
        return users;
    }

    @Override
    public User getUserInfo(Long uid) {
        return null;
    }

    @Override
    public CompletableFuture<String> sayHello(String name) {
        return null;
    }
}
