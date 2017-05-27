package com.shop.service;


import com.shop.entity.Products;
import com.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService
{
    @Autowired
    private ProductsRepository repository;
    public List<Products> getAll() {
        return repository.findAll();
    }

    public Products getByID(int id) {
        return repository.findOne(id);
    }

    public Products save(Products products) {
        return repository.saveAndFlush(products);
    }

    public void remove(int id) {
        repository.delete(id);
    }
}
