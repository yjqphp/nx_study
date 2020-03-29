package com.demo.yewu.remote;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.platform.product.entity.Product;
import com.demo.platform.user.entity.User;
import com.demo.yewu.contract.IBusinessLogicService;
import com.demo.yewu.entity.ListingItem;
import com.demo.yewu.syetem.init.RPCClients;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuan
 */
@Service(version = "1.0.0")
public class BusinessLogicServiceImpl implements IBusinessLogicService {

    @Autowired
    RPCClients dubboRemoteServies;

    @Override
    public List<ListingItem> getProductListing(Map<String, String> param) {
        //获取商品列表
        List<Product> products = dubboRemoteServies.getSyncProductService().getProductByTimestamp(1);
        List<Long> uids = new ArrayList<>();
        Map<Long,Product> uidProMap = new HashMap<>();
        //遍历结果获取uid
        for(Product item:products)
        {
            uids.add(item.getUid());
            uidProMap.put(item.getUid(),item);
        }
        //批量获取用户信息
        List<ListingItem> Listting = new ArrayList<>();
        List<User> users = dubboRemoteServies.getSyncUserService().getUserInfos(uids);
        for (User user:users)
        {
            ListingItem item = new ListingItem();
            Product tepPro = uidProMap.get(user.getUid());
            item.setInfoId(tepPro.getInfoId());
            item.setTitle(tepPro.getTitle());
            item.setDescribe(tepPro.getDescribe());
            item.setImages(tepPro.getImages());
            item.setUid(user.getUid());
            item.setNickName(user.getNickName());
            Listting.add(item);
        }

        return Listting;
    }
}
