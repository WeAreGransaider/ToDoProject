package com.example.demo.Enity;
import java.util.ArrayList;
import java.util.Date;

public class Task {

    private String title;

    private String text;

    private Date creationDate;

    private Date experationDate;

    private Integer id;

    private ArrayList<String> tag;




    public Task(String title, String text, Date creationDate, Date experationDate,Integer id,ArrayList<String> tag) {
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
        this.experationDate = experationDate;
        this.id = id;
        this.tag = tag;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<String> getTag() {
        return tag;
    }

    public void setTag(ArrayList<String> tag) {
        this.tag = tag;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
