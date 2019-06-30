package com.yej.ssm.service;

import com.yej.ssm.pojo.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listUserProducts(int userid);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);
    public Product queryProductById(int id);
}
