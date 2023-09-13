package com.example.demo.Enity;

public class Person {
    private String name;

    private String surName;

    private int age;

    private int id;



    public Person(String name,String surName, int age,int id) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
