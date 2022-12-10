package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MyViewController {
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("acceuil.html");
        return modelAndView;
    }
    @RequestMapping("/acceuil")
    public ModelAndView acceuil() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("acceuil");
        return modelAndView;
    }

}
