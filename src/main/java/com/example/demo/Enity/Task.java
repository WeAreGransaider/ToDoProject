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
@Table(name = "task")
@EqualsAndHashCode
public class Task {

    private String title;
    private String text;
    private String creationDate;
    private String experationDate;
    private Long personId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tag;

    public Task() {
    }

    public Task(String title, String text, String creationDate, String experationDate,Long id,Long personId,String tag) {
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
        this.experationDate = experationDate;
        this.id = id;
        this.personId = personId;
        this.tag = tag;
    }



}
