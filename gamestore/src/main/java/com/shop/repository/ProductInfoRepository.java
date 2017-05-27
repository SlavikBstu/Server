package com.shop.repository;

import com.shop.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {
}
