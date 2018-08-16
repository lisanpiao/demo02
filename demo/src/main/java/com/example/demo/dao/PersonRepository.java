package com.example.demo.dao;
import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer>{
    /*
    * 通过age来查询
    * @param age
    * @return
    * */
    public List<Person> findByAge(Integer age);
}
