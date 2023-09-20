package com.example.demo.Enity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
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


//    public String getName() {
//        return name;
//    }
//
//    public String getSurName() {
//        return surName;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
