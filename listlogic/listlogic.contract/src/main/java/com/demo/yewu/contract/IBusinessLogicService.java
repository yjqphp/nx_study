package com.demo.yewu.contract;

import com.demo.yewu.entity.ListingItem;

import java.util.List;
import java.util.Map;

/**
 * @author yuan
 */
public interface IBusinessLogicService {

    List<ListingItem> getProductListing(Map<String,String> param);
}
