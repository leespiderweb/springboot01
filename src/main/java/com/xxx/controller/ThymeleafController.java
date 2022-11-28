package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    @RequestMapping("/thy")
    public String Thyme1(Model model){

        System.out.println("heooooooooooooo");
        model.addAttribute("msg","Ooops ! ");

        return "thyme1";

    }

}
