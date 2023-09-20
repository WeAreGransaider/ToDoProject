package com.example.demo.Enity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class Task {

    private String title;
    private String text;
    private Date creationDate;
    private Date experationDate;
    private final Integer id;

    private ArrayList<String> tag;




    public Task(String title, String text, Date creationDate, Date experationDate,Integer id,ArrayList<String> tag) {
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
        this.experationDate = experationDate;
        this.id = id;
        this.tag = tag;
    }
}
