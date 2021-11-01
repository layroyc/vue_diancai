package com.xiexin.service;

import com.xiexin.bean.Foods;
import com.xiexin.bean.FoodsExample;
import com.xiexin.dao.FoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foodsService")
public class FoodsServiceImpl implements FoodsService {
	@Autowired(required = false)
	private FoodsDAO foodsDAO;
	public long countByExample(FoodsExample example){
    	return foodsDAO.countByExample(example);
    }

	public int deleteByExample(FoodsExample example){
    	return foodsDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return foodsDAO.deleteByPrimaryKey(id);
    }

	public int insert(Foods record){
    	return foodsDAO.insert(record);
    }

	public int insertSelective(Foods record){
    	return foodsDAO.insertSelective(record);
    }

	public List<Foods> selectByExample(FoodsExample example){
    	return foodsDAO.selectByExample(example);
    }

	public Foods selectByPrimaryKey(Integer id){
    	return foodsDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Foods record, FoodsExample example){
    	return foodsDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Foods record, FoodsExample example){
    	return foodsDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Foods record){
    	return foodsDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Foods record){
    	return foodsDAO.updateByPrimaryKey(record);
    }


}
