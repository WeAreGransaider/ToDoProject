package com.example.demo.DataBase;

import com.example.demo.Enity.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TaskDao {

    private ArrayList<Task> listTask;
    {
        this.listTask = new ArrayList<>();
        ArrayList<String> tags = new ArrayList<>();
        tags.add("Homework");
        listTask.add(new Task("Сворить кофе","Сварить кофе(text)", new Date(),new Date(),1,tags));
        listTask.add(new Task("Сворить кашу","Сварить кашу(text)", new Date(),new Date(),2,tags));
        listTask.add(new Task("Сворить чай","Сварить чай(text)", new Date(),new Date(),3,tags));
    }

    public List<Task> getAllTask(){
        return this.listTask;
    }

    public void saveTask(Task task){
    this.listTask.add(task);
    }

}