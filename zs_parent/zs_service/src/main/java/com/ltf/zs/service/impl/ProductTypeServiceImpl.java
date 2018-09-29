package com.ltf.zs.service.impl;

import com.ltf.zs.common.constant.ProductTypeConstant;
import com.ltf.zs.common.exception.ProductTypeExistException;
import com.ltf.zs.pojo.ProductType;
import com.ltf.zs.dao.ProductTypeDao;
import com.ltf.zs.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeDao productTypeDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<ProductType> findAll() {
        return productTypeDao.selectAll();
    }

    @Override
    public void add(String name) throws ProductTypeExistException {
        ProductType productType=productTypeDao.selectByName(name);
        if(productType !=  null){
            throw new ProductTypeExistException("haved exist");
        }
        productTypeDao.insert(name, ProductTypeConstant.Product_TYPE_ENABLE);
    }
}
