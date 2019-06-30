package com.yej.ssm.pojo;

public class Product {
    int id;
    String name;
    float price;
    int uid;
    int delete_;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getDelete_() {
        return delete_;
    }

    public void setDelete_(int delete_) {
        this.delete_ = delete_;
    }
}
