package com.webEgresados.portal.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class publicController {

    @GetMapping("")
    public String index(){
        return "index";
    }
}
