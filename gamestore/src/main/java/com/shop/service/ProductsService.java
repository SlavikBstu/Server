package com.shop.service;

import com.shop.entity.Products;

import java.util.List;

/**
 * Created by Владислав on 20.05.2017.
 */
public interface ProductsService
{
    List<Products> getAll();
    Products getByID(int id);
    Products save(Products products);
    void remove(int id);

}

