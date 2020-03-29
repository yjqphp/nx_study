package com.demo.platform.product.remote;


import com.alibaba.dubbo.config.annotation.Service;
import com.demo.platform.product.contract.IProductService;
import com.demo.platform.product.entity.Product;

import java.util.ArrayList;

/**
 * @author yuan
 */
@Service(version = "1.0.0")
public class ProductServiceImpl implements IProductService {
    @Override
    public ArrayList<Product> getProductByTimestamp(int type) {

        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i<10; i++)
        {
            Product tmp = new Product();
            tmp.setInfoId(1000000L + i);
            tmp.setUid(100L + i);
            tmp.setImages("pic.nx.com/1111.jpg");
            tmp.setTitle("商品标题" + i);
            tmp.setDescribe("商品描述" + i);
            products.add(tmp);
        }
        return products;
    }

    @Override
    public Product getProductById(Long infoId) {
        return null;
    }
}
