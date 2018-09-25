package com.ltf.zs.backend.controller;

import com.ltf.zs.pojo.ProductType;
import com.ltf.zs.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<ProductType> productTypes=productTypeService.findAll();
        model.addAttribute("productTypes",productTypes);
        return "productTypeManager";
    }
}
