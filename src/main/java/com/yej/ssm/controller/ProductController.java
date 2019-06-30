package com.yej.ssm.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yej.ssm.pojo.Product;
import com.yej.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("listUserProducts")
    public ModelAndView listUserProduct(int userid){
        ModelAndView modelAndView = new ModelAndView("listUserProducts");
        List<Product> products = productService.listUserProducts(userid);
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @RequestMapping("deleteProduct")
    public String deleteProduct(int id){
        Product product = productService.queryProductById(id);
        product.setDelete_(1);
        productService.updateProduct(product);
        return "redirect:/listUserProducts?userid=1";
    }

    @RequestMapping("updateProduct")
    public String updateProduct(Product product){
        product.setDelete_(0);
        productService.updateProduct(product);
        return "redirect:/listUserProducts?userid=1";
    }

    @RequestMapping("editProduct")
    public ModelAndView editProduct(int id){
        Product product = productService.queryProductById(id);
        ModelAndView modelAndView = new ModelAndView("editProduct");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
}
