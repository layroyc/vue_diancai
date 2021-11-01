package com.xiexin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiexin.bean.Person;
import com.xiexin.bean.PersonExample;
import com.xiexin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired(required = false)
    private PersonService personService;


// 单个查询

    @RequestMapping("/personId") ///api/person/personId
    public Map personId(Integer personId) {
        Map codeMap = new HashMap();
        Person person = personService.selectByPrimaryKey(personId);
        codeMap.put("code", 0);
        codeMap.put("msg", "OK");
        codeMap.put("data", person);
        return codeMap;
    }


    //增
// 后端订单增加 -- 针对layui的 针对前端传 json序列化的
    @RequestMapping("/insert")
    public Map insert(@RequestBody Person person) { // orders 对象传参, 规则: 前端属性要和后台的属性一致!!!
        Map map = new HashMap();
        int i = personService.insertSelective(person);
        if (i > 0) {
            map.put("code", 200);
            map.put("msg", "添加成功");
            return map;
        } else {
            map.put("code", 400);
            map.put("msg", "添加失败,检查网络再来一次");
            return map;
        }
    }


    // 删
// 删除订单  根据 主键 id 删除
    @RequestMapping("/deleteById")
    public Map deleteById(@RequestParam(value = "id") Integer id) {
        Map responseMap = new HashMap();
        int i = personService.deleteByPrimaryKey(id);
        if (i > 0) {
            responseMap.put("code", 200);
            responseMap.put("msg", "删除成功");
            return responseMap;
        } else {
            responseMap.put("code", 400);
            responseMap.put("msg", "删除失败");
            return responseMap;
        }
    }

    // 批量删除
    @RequestMapping("/deleteBatch")
    public Map deleteBatch(@RequestParam(value = "idList[]") List<Integer> idList) {
        for (Integer integer : idList) {
            this.deleteById(integer);
        }
        Map responseMap = new HashMap();
        responseMap.put("code", 200);
        responseMap.put("msg", "删除成功");
        return responseMap;
    }


    // 改
    // 修改订单
    @RequestMapping("/update")
    public Map update(@RequestBody Person person) {
        Map map = new HashMap();
        int i = personService.updateByPrimaryKeySelective(person);
        if (i > 0) {
            map.put("code", 200);
            map.put("msg", "修改成功");
            return map;
        } else {
            map.put("code", 400);
            map.put("msg", "修改失败,检查网络再来一次");
            return map;
        }
    }

    // 查--未分页
    // 全查
    @RequestMapping("/selectAll")
    public Map selectAll() {
        List<Person> persons = personService.selectByExample(null);
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("persons", persons);
        return responseMap;
    }

    // 查-- 查询+自身对象的查询 + 分页
// 分页查询
    @RequestMapping("/selectAllByPage")
    public Map selectAllByPage(Person person, @RequestParam(value = "page", defaultValue = "1", required = true) Integer page,
                               @RequestParam(value = "limit", required = true) Integer pageSize) {
        // 调用service 层   , 适用于 单表!!!
        PageHelper.startPage(page, pageSize);
        PersonExample example = new PersonExample();
        PersonExample.Criteria criteria = example.createCriteria();

//    if (null!=person.getYYYYYYYY()&&!"".equals(person.getYYYYYYY())){
//         criteria.andPhoneEqualTo(person.getPhone());   // 1
//    }

        List<Person> personsList = personService.selectByExample(example);
        PageInfo pageInfo = new PageInfo(personsList);
        long total = pageInfo.getTotal();
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("pageInfo", pageInfo);
        responseMap.put("count", total);
        return responseMap;
    }


}
