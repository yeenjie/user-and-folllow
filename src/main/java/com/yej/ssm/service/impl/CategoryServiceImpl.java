package com.yej.ssm.service.impl;
import com.yej.ssm.mapper.CategoryMapper;
import com.yej.ssm.pojo.Category;
import com.yej.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list(){
        return categoryMapper.list();
    }

}