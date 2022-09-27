package com.sopra.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Details {
    
    @RequestMapping("/details")
    public String details() {
        return "details";
    }
}