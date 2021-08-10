package com.ismt.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hero")
public class FrontEndController {


    @GetMapping
    public String root() {
    //Model prepare
        return "index";
    }


}
