package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/add")
    public String add() {
        /* basic java exception handelling
        try{
            int num = 10 / 0;
        }catch (Exception e){
            System.out.println(e);
        }
        */
        int [] arr= new int[5];
        int num =10/0;
        return "add";
    }

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase(); // this should cause null pointer exception
        return "update";
    }

}
