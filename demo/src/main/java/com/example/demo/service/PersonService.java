package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    /*
    * @return 全部数据
    * */
    public List<Person> personList(){
        return personRepository.findAll();
    }
    /*
    * @return 添加信息
    * */
    public Person personAdd(Person person){
        return this.personRepository.save(person);
    }
   /* *//*
    * 删除信息
    * *//*
    public void personDelete(Integer id){
        this.personRepository.delete(id);
    }*/
}
