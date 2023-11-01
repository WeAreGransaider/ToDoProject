package com.example.demo.Enity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "person1")
@EqualsAndHashCode

public class Person {

    private String name;
    private String surName;
    private Integer age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;



    public Person(String name,String surName, Integer age,Long id) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.id = id;
    }
}
