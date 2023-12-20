package com.example.demo.Enity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
