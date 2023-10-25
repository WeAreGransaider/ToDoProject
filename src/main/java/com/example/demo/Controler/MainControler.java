package com.example.demo.Controler;

import com.example.demo.DataBase.TaskDao;
import com.example.demo.DataBase.TaskDaoArray;
import com.example.demo.Enity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


@Controller
public class MainControler{

    @Autowired
    private TaskDao taskDao;

    public MainControler(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @GetMapping
    public String loginFirst(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/login")
    public String login(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }

    @GetMapping("/taskAdd")
    public String taskAdd(Map<String, Object> model) {
    return "taskAdd";
    }

    @PostMapping("/taskAdd")
    public String setTask(@RequestParam String title,@RequestParam String text,@RequestParam Integer id,Map<String, Object> model) {
        taskDao.saveTask(new Task(title,text,new Date(),new Date(),id,new ArrayList<>()));
        model.put("tasks",taskDao.getAllTask());
        return "tasks";
    }

    @GetMapping("/editTask/{id}")
    public String getTasksById(@PathVariable Integer id, Map<String, Object> model) {
        model.put("task",taskDao.getById(id));
        return "editTask";
    }

    @GetMapping("/tasks")
    public String getTasks(Map<String, Object> model) {
        model.put("tasks",taskDao.getAllTask());
        return "tasks";
    }



}
