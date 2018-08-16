package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String show(){
        return "hello world";
    }


   /* @Value("${name}")
    private String name;

    @RequestMapping(value = "/helloName",method = RequestMethod.GET)
    public  String showName(){
        return name;
    }*/
   /* @Autowired
    private PersonEntity personEntity;

    @RequestMapping(value = "/showPerson",method = RequestMethod.GET)
    public String showPerson(){

        return personEntity.getId()+","+personEntity.getName()+","+personEntity.getAge();
    }*/
}
