package com.shop.service;

import com.shop.Product;
import com.shop.entity.ProductInfo;
import com.shop.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 21.05.2017.
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService
{
    @Autowired
    private ProductInfoRepository repository;
    public List<Product> getAll() {
        List<ProductInfo> list = repository.findAll();
        ArrayList<Product> products = new ArrayList<Product>();
        Product product;
        /*for(int i = 0; i < list.size();i++)
        {
            product = new Product(list.get(i).getId(),list.get(i).getProductId().getTitle(),list.get(i).getCompany(),list.get(i).getAnnotation(),list.get(i).getReleaseDate());
            products.add(product);
        }*/
        return products;
    }
}
