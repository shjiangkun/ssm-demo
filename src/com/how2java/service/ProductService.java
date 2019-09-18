package com.how2java.service;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

import java.util.List;

public interface ProductService {
    int add(Product product);

    void delete(int id);

    Category get(int id);

    int update(Product product);

    List<Product> list(int cid);
}
