package com.ltf.zs.dao;

import java.util.List;
import com.ltf.zs.pojo.ProductType;
public interface ProductTypeDao {
    /**
     * 查找所有商品类型
     * @return
     */
    public List<ProductType> selectAll();
}
