package com.how2java.service.impl;

import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public int add(Product product) {
        return productMapper.add(product);
    }

    @Override
    public void delete(int id) {
        productMapper.delete(id);
    }

    @Override
    public Category get(int id) {
        return productMapper.get(id);
    }

    @Override
    public int update(Product product) {
        return 0;
    }

    @Override
    public List<Product> list(int cid) {
        return productMapper.list(cid);
    }
}
