package com.shop;

import java.util.Date;

/**
 * Created by Владислав on 21.05.2017.
 */
public class Product {
    private int id;
    private String name;
    private String company;
    private String annotation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Product(int id, String name, String company, String annotation, Date releaseDate) {

        this.id = id;
        this.name = name;
        this.company = company;
        this.annotation = annotation;
        this.releaseDate = releaseDate;
    }

    private Date releaseDate;

}
