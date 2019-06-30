package com.yej.ssm.mapper;

import com.yej.ssm.pojo.Product;

import java.util.List;

public interface ProductMapper {
    public List<Product> listUserProducts(int userid);
    public void updateProduct(Product product);
    public Product queryProductById(int id);
}
