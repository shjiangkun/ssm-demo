package com.how2java.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.CategoryService;
import com.how2java.service.ProductService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("listProduct")
    public ModelAndView listCategory(int cid,Page page) {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(), 5);
        List<Product> ps = productService.list(cid);
        int total = (int) new PageInfo<>(ps).getTotal();
        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("ps", ps);
        mav.addObject("cid",cid);
        // 放入jsp路径
        mav.setViewName("listProduct");
        return mav;
    }

    @RequestMapping("deleteProduct")
    public ModelAndView deleteProduct(int id,int cid){
        ModelAndView mav = new ModelAndView();
        productService.delete(id);
        mav.addObject("cid",cid);

        mav.setViewName("redirect:listProduct");
        return mav;
    }

}
