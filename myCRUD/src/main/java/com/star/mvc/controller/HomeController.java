package com.star.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String getHome() {
        return "index";
    }

    @RequestMapping(value = "/showDetails")
    public String getShowDetails(HttpServletRequest httpServletRequest){

        return "showDetails";
    }
}
