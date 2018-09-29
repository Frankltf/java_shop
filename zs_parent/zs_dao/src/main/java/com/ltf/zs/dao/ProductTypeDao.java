package com.ltf.zs.dao;

import java.util.List;
import com.ltf.zs.pojo.ProductType;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeDao {
    /**
     * 查找所有商品类型
     * @return
     */
    public List<ProductType> selectAll();

    public void insert(@Param("name")String name, @Param("status")int status);

    public ProductType selectByName(String name);

    public ProductType selectById(int id);
}
