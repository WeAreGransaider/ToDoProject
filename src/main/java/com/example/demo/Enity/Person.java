package com.example.demo.Enity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "person")
@EqualsAndHashCode

public class Person {

    private String name;
    private String surName;
    private String login;
    private String password;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Person () {
    }

    public Person (String login,String password) {
        this.login = login;
        this.password = password;
    }

    public Person(String name,String surName,String login,String password) {
        this.name = name;
        this.surName = surName;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

}
