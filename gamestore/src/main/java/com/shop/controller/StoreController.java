package com.shop.controller;

import com.shop.Product;
import com.shop.entity.Orders;
import com.shop.entity.Products;
import com.shop.service.OrdersService;
import com.shop.service.ProductInfoService;
import com.shop.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController
{
    @Autowired
    private ProductsService service;

    @RequestMapping(value = "/products", method = RequestMethod.GET,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public List<Products> getAllProducts() {
        return service.getAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public Products getProduct(@PathVariable("id") int productID) {
        return service.getByID(productID);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public Products saveProducts(@RequestBody Products products) {
        return service.save(products);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.remove(id);
    }

    // product inf
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/productinfo", method = RequestMethod.GET,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public List<Product> getAllInfo() {
        return productInfoService.getAll();
    }

    // orders
    private OrdersService ordersService;
    @RequestMapping(value = "/orders", method = RequestMethod.POST,produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public Orders saveOrders(@RequestBody Orders orders) {
        return ordersService.save(orders);
    }
}
