package com.xiexin.service;

import com.xiexin.bean.Person;
import com.xiexin.bean.PersonExample;
import com.xiexin.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired(required = false)
	private PersonDAO personDAO;
	public long countByExample(PersonExample example){
    	return personDAO.countByExample(example);
    }

	public int deleteByExample(PersonExample example){
    	return personDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return personDAO.deleteByPrimaryKey(id);
    }

	public int insert(Person record){
    	return personDAO.insert(record);
    }

	public int insertSelective(Person record){
    	return personDAO.insertSelective(record);
    }

	public List<Person> selectByExample(PersonExample example){
    	return personDAO.selectByExample(example);
    }

	public Person selectByPrimaryKey(Integer id){
    	return personDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Person record, PersonExample example){
    	return personDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Person record, PersonExample example){
    	return personDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Person record){
    	return personDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Person record){
    	return personDAO.updateByPrimaryKey(record);
    }


}
