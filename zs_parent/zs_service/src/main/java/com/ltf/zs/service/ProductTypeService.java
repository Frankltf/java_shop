package com.ltf.zs.service;

import com.ltf.zs.common.exception.ProductTypeExistException;
import com.ltf.zs.pojo.ProductType;
import java.util.List;
public interface ProductTypeService {
    public List<ProductType> findAll();

    public void add(String name) throws ProductTypeExistException;
}
