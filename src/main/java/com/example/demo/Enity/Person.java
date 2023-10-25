package com.example.demo.Enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Person")
@EqualsAndHashCode
public class Person {

    private String name;
    private String surName;
    private Integer age;
    private final Integer id;



    public Person(String name,String surName, Integer age,Integer id) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.id = id;
    }
}
