package com.ltf.zs.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {

    @RequestMapping("/findAll")
    public String findAll(){
        return "productTypeManager";
    }
}
