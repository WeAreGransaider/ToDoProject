package com.example.demo.DataBase;

import com.example.demo.Enity.Task;

import java.util.List;

public interface TaskDao {

    List<Task> getAllTask();

    void saveTask(Task task);

    Task getById(Integer id);

}
