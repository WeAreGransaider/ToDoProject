package com.example.demo.Enity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Task")
@EqualsAndHashCode
public class Task {

    private String title;
    private String text;
    private Date creationDate;
    private Date experationDate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ArrayList<String> tag;

    public Task() {
    }

    public Task(String title, String text, Date creationDate, Date experationDate,Long id,ArrayList<String> tag) {
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
        this.experationDate = experationDate;
        this.id = id;
        this.tag = tag;
    }



}
