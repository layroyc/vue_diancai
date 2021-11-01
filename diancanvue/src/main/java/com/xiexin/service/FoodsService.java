package com.xiexin.service;

import com.xiexin.bean.Foods;
import com.xiexin.bean.FoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodsService {
   
    long countByExample(FoodsExample example);

    int deleteByExample(FoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    List<Foods> selectByExample(FoodsExample example);

    Foods selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Foods record, @Param("example") FoodsExample example);

    int updateByExample(@Param("record") Foods record, @Param("example") FoodsExample example);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);

}
