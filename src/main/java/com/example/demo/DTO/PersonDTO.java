package com.example.demo.DTO;

import com.example.demo.Enity.Person;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@EqualsAndHashCode
public class PersonDTO {

    private String name;

    private String surName;


    public PersonDTO(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public static PersonDTO personDTOConvertor (Person person) {
        return new PersonDTO(person.getName(), person.getSurName());
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurName() {
//        return surName;
//    }
//
//    public void setSurName(String surName) {
//        this.surName = surName;
//    }
}
