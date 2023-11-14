package com.example.demo.Controler;

import com.example.demo.DataBase.PersonDao;
import com.example.demo.DataBase.TaskDao;
import com.example.demo.Enity.Person;
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

    @Autowired
    private PersonDao personDao;

    public MainControler(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @GetMapping
    public String loginFirst(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/login")
    public String loginGet(Map<String, Object> model){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String login,@RequestParam String password,Map<String, Object> model) {
        Person person = personDao.getByLogin(login);
        System.out.println(person.getPassword() + " " + password);
        if(person.getPassword().equals(password)) {
            model.put("tasks",taskDao.findAll());
            return "redirect:/tasks";
        }
        System.out.println("Логин или пароль не подошел");
        return "redirect:/login";
    }

    @GetMapping("/registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String setPerson(@RequestParam String name,@RequestParam String surName,@RequestParam String login,@RequestParam String password) {
        Person person = new Person(name,surName,login,password);
        personDao.saveAndFlush(person);
        System.out.println(person);
        return "redirect:/login";
    }

    @GetMapping("/taskAdd")
    public String taskAdd(Map<String, Object> model) {
    return "taskAdd";
    }

    @PostMapping("/taskAdd")
    public String setTask(@RequestParam String title,@RequestParam String text,@RequestParam Long id,Map<String, Object> model) {
        Task task = new Task(title,text,new Date(),new Date(),id,new ArrayList<>());
        taskDao.saveAndFlush(task);
        model.put("tasks",taskDao.findAll());
        return "redirect:/tasks";
    }

    @PostMapping("/deleteTask/{id}")
    public String deleteById(@PathVariable Long id,Map<String, Object> model) {
        taskDao.deleteById(id);
        model.put("tasks",taskDao.findAll());
        return "redirect:/tasks";
    }

    @GetMapping("/editTask/{id}")
    public String getTasksById(@PathVariable Long id, Map<String, Object> model) {
        model.put("task",taskDao.getById(id));
        return "editTask";
    }

    @GetMapping("/tasks")
    public String getTasks(Map<String, Object> model) {
        model.put("tasks",taskDao.findAll());
        return "tasks";
    }

}
