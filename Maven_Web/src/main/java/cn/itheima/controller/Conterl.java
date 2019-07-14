package cn.itheima.controller;

import cn.itheima.domain.Product;
import cn.itheima.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/first")
public class Conterl {
    @Autowired
    private IproductService service;
    @RequestMapping("/find")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(service.findAll());
        modelAndView.addObject("productList",service.findAll());
        modelAndView.setViewName("product-list");
        return modelAndView;
    }
}
