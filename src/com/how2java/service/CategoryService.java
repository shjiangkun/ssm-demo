package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

public interface CategoryService {

    List<Category> list();
    int add(Category category);
    void delete(int id);
    Category get(int id);
    int update(Category category);
}
