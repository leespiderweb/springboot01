package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){

        System.out.println("heooooooooooooo");
        return "heooooooooooooo";

    }

}
