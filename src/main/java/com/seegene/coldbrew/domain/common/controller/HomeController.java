package com.seegene.coldbrew.domain.common.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class HomeController {
    @RequestMapping("")
    public String home(){
        return "index";
    }
}
