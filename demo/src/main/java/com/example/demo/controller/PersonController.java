package com.example.demo.controller;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PersonController {

   /* @Autowired
    PersonRepository personRepository;*/

    @Autowired
    private PersonService personService;
    /*
    * 查询所有的数据
    * */
    @RequestMapping(value = "/personList")
    public ModelAndView personList(HttpServletRequest request){
        List<Person> list = this.personService.personList();
        request.setAttribute("personList",list);
        return new ModelAndView("personList");
    }

   /* *//*
    * 添加一条数据
    * @param name
    * @param age
    * @return
    * *//*
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name,
                             @RequestParam("age") Integer age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        return personRepository.save(person);
    }
    *//*
    * 查询一个人
    * @param id
    *@return
    * *//*
    @GetMapping(value = "/person/{id}")
    public Person perosnById(@RequestParam("id") Integer id){
        return personRepository.findOne(id);
    }

    *//*
    * 删除一个人
    * @param id
    * @return
    * *//*
    @DeleteMapping(value = "/perosn/{id}")
    public void personDelete(@PathVariable("id") Integer id){
        personRepository.delete(id);
    }

    *//*
    * 更新数据
    *
    * @param id
    * @param name
    * @param age
    *@return
    * *//*
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                                @RequestParam("name") String name,
                                @RequestParam("age") Integer age){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    *//*
    * 通过age来查询
    * @param id
    * @return
    * *//*
    @GetMapping(value = "/perosn/age/{age}")
    public List<Person> personListByAge(@PathVariable("age") Integer age){
        return personRepository.findByAge(age);
    }
*/
}
