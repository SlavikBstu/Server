package com.shop.utility;

import com.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Владислав on 22.05.2017.
 */
@Component
public class ProductUtility {
    @Autowired
    ProductsRepository repository;
    public String addProduct(String string)
    {
        String s = string;
        return "success!";
    }
}
