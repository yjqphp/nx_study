package com.example.yewu.contract;

import com.example.yewu.entity.ListingItem;

import java.util.List;
import java.util.Map;

/**
 * @author yuan
 */
public interface IBusinessLogicService {

    List<ListingItem> getProductListing(Map<String,String> param);
}
