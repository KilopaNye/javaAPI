package com.example.demo.model;

import java.util.Date;

public class Product {
    Integer id;
    Integer ownerId;
    String productName;
    Integer productPrice;
    Integer productAmount;
    String ownerPreSite;
    String countrySite;
    String productIntro;
    Date uploadTime;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getOwnerPreSite() {
        return ownerPreSite;
    }

    public void setOwnerPreSite(String ownerPreSite) {
        this.ownerPreSite = ownerPreSite;
    }

    public String getCountrySite() {
        return countrySite;
    }

    public void setCountrySite(String countrySite) {
        this.countrySite = countrySite;
    }

    public String getProductIntro() {
        return productIntro;
    }

    public void setProductIntro(String productIntro) {
        this.productIntro = productIntro;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
