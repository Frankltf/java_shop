package com.ltf.zs.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltf.zs.common.constant.PaginationConstant;
import com.ltf.zs.common.constant.ResponseStatusConstant;
import com.ltf.zs.common.exception.ProductTypeExistException;
import com.ltf.zs.common.util.ResponseResult;
import com.ltf.zs.pojo.ProductType;
import com.ltf.zs.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/findAll")
    public String findAll(Integer pageNum,Model model){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum=PaginationConstant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);

        List<ProductType> productTypes=productTypeService.findAll();
        PageInfo<ProductType> pageInfo=new PageInfo<>(productTypes);
        model.addAttribute("pageInfo",pageInfo);
        return "productTypeManager";
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResponseResult add(String name){
        ResponseResult responseResult=new ResponseResult();
        try {
            productTypeService.add(name);
            responseResult.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
            responseResult.setMsg("success");
        } catch (ProductTypeExistException e) {
            responseResult.setStatus(ResponseStatusConstant.RESPONSE_STATUS_FAIL);
            responseResult.setMsg(e.getMessage());
        }
        return  responseResult;
    }
}
