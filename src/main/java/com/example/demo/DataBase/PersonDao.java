package com.example.demo.DataBase;

import com.example.demo.Enity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface PersonDao extends JpaRepository<Person,Long>{

    Person getById(Long id);

    Person getByNameAndSurName(String name,String surName);

    Person getByLogin(String login);


    Long deleteById(Integer id);
}
