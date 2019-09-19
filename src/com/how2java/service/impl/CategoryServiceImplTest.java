package com.how2java.service.impl;

import com.how2java.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void addTwo() {
        categoryService.deleteAll();
        categoryService.addTwo();
    }

}