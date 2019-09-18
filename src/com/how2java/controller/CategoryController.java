package com.how2java.controller;

import java.util.List;

import com.how2java.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(), 5);
        List<Category> cs = categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }

    @RequestMapping("addCategory")
    public ModelAndView addCategory(Category category) {
        ModelAndView mav = new ModelAndView();
        categoryService.add(category);

        mav.setViewName("redirect:listCategory");
        return mav;
    }

    @RequestMapping("deleteCategory")
    public ModelAndView deleteCategory(int id) {
        ModelAndView mav = new ModelAndView();
        categoryService.delete(id);

        mav.setViewName("redirect:listCategory");
        return mav;
    }

    @RequestMapping("editCategory")
    public ModelAndView editCategory(int id) {
        ModelAndView mav = new ModelAndView();
        Category c = categoryService.get(id);
        mav.addObject("c", c);
        mav.setViewName("editCategory");
        return mav;
    }

    @RequestMapping("updateCategory")
    public ModelAndView updateCategory(Category category) {
        ModelAndView mav = new ModelAndView();
        categoryService.update(category);
        mav.setViewName("redirect:listCategory");
        return mav;
    }

}
