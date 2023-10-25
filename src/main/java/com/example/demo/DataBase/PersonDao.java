package com.example.demo.DataBase;

import com.example.demo.Enity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface PersonDao extends JpaRepository<Person,Long>{

    Person getById(Integer Id);

    Person getByName(String name);

}
