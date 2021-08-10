package com.ismt.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping("/dashboard")
public class DashboardController {


    @Autowired


    @GetMapping(value = "/apple", consumes = "application/json")
    public String root() {
//Model prepare
        return "index.jsp";
    }


}
