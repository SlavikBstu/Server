package com.shop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Владислав on 21.05.2017.
 */
@Entity
@Table(name = "ProductInfo")
public class ProductInfo
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Products productId;

    @Column(name = "company", nullable = false, length = 20)
    private String company;

    @Column(name = "annotation", nullable = false, length = 20)
    private String annotation;


    @Column(name = "releaseDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;

    public ProductInfo() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
