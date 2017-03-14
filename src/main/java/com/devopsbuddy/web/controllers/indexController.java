package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mollywhitnack on 3/3/17.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
