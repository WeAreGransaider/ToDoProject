package com.example.demo.DataBase;

import com.example.demo.Enity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    public Person findPerson(int id) {
        if(id == 0) {
            return new Person("Иван","Иванов",24,0);
        }
            return new Person("Вова","Вовович",21,1);
    }
}
