package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

import java.util.List;

public interface ProductMapper {
    public int add(Product product);

    public void delete(int id);

    public Category get(int id);

    public int update(Product product);

    public List<Product> list(int cid);

}
