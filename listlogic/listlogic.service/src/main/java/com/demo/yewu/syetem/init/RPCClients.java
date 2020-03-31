package com.demo.yewu.syetem.init;


import com.demo.platform.product.contract.IProductService;
import com.demo.platform.user.contract.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class RPCClients {

    @Reference(version = "1.0.0",timeout = 2000)
    private IProductService syncProductService;

    @Reference(version = "1.0.0",timeout = 2000)
    private IUserService syncUserService;

    public  IProductService getSyncProductService(){
        return  syncProductService;
    }

    public IUserService getSyncUserService(){
        return syncUserService;
    }
}

