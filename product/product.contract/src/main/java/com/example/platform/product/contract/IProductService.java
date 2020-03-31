package com.example.platform.product.contract;

import com.example.platform.product.entity.Product;

import java.util.ArrayList;

/**
 * 商品服务
 * @author yuan
 */
public interface IProductService  {
    /**
     * 暂不确定
     * @param type
     * @return
     */
    ArrayList<Product> getProductByTimestamp(int type);

    /**
     * 根据id获取产品
     * @param infoId
     * @return
     */
    Product getProductById(Long infoId);
}
