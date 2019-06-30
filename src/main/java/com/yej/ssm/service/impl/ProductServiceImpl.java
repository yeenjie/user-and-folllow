package com.yej.ssm.service.impl;

import com.yej.ssm.mapper.ProductMapper;
import com.yej.ssm.pojo.Product;
import com.yej.ssm.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> listUserProducts(int userid){

        return productMapper.listUserProducts(userid);
    }

    @Override
    public void deleteProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public Product queryProductById(int id) {
        return productMapper.queryProductById(id);
    }
}
