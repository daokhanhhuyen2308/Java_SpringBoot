package com.codevui.todoapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codevui.todoapp.service.TodoService;

@Controller
public class MainController {
    @Autowired
    TodoService todoService;

    @GetMapping("/hello")
    //xu ly logic gi day
    public String hello(){
        //day khong phai la String ma day chinh la file html ma no se tra ve
        return "hello";
    }
    
}
