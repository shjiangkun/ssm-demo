package com.how2java.service.impl;

import java.util.List;

import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> list(){
        return categoryMapper.list();
    }

    @Override
    public int add(Category category) {
        return categoryMapper.add(category);
    }

    @Override
    public void delete(int id) {
        categoryMapper.delete(id);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.update(category);
    }
}
