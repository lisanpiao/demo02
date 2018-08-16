package com.example.demo;

import com.example.demo.controller.PersonController;
import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @Test
    public void testFindPerson(){
        List<Person> list = personService.personList();
        for (Person p:list){
            System.out.println("id="+p.getId()+",name="+p.getName()+",age="+p.getAge());
        }
    }

    /*
    * Test查询全部信息
    * */
    @Test
    public void testFindAll(){
        List<Person> list = personRepository.findAll();
        System.out.println(list.size());
        for (Person p:list){
            System.out.println("id="+p.getId()+",name="+p.getName()+",age="+p.getAge());
        }
    }

    /*
    * Test查询单个信息
    * */
    @Test
    public void testFind(){
        Person p = personRepository.findOne(1);
        System.out.println("id="+p.getId()+",name="+p.getName()+",age="+p.getAge());
    }

    /*
    * Test添加信息
    * */
    @Test
    public void testAdd(){
        Person person = new Person();
        person.setName("张三三三三");
        person.setAge(23);
        personRepository.save(person);
        Assert.assertEquals(23,person.getAge().intValue());
    }

    /*
    * Test修改信息
    * */
    @Test
    public void testUpdate(){
        Person p = personRepository.findOne(1);
        p.setName("王五五五");
        personRepository.save(p);
        System.out.println("id="+p.getId()+",name="+p.getName()+",age="+p.getAge());
    }

    /*
    * Test 删除一条信息
    * */
    @Test
    public void testDelete(){
        personRepository.delete(2);
        System.out.println("删除成功");
    }

    /*
    * Test按照age查询
    * */
    @Test
    public void findByAge(){
        List<Person> list = personRepository.findByAge(23);
        for (Person p:list) {
            System.out.println("id="+p.getId()+",name="+p.getName()+",age="+p.getAge());
        }
    }

    /*
    * Test查询数据总记录数
    * @return Integer
    * */
    @Test
    public void findCount(){
        Long num = personRepository.count();
        System.out.println(num);
    }

}
