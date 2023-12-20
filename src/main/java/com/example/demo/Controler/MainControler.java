package com.example.demo.Controler;

import com.example.demo.DataBase.PersonDao;
import com.example.demo.DataBase.RoleUserDao;
import com.example.demo.DataBase.TaskDao;
import com.example.demo.Enity.Person;
import com.example.demo.Enity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


@Controller
public class MainControler{

    private static long staticIdPerson = 1;

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private PersonDao personDao;

    @Autowired
    private RoleUserDao roleUserDao;

    public MainControler(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @GetMapping
    public String loginFirst(Map<String, Object> model) {
        return "redirect:/my_login";
    }

    @GetMapping("/my_login")
    public String loginGet(Map<String, Object> model){
        return "my_login";
    }

    @PostMapping("/my_login")
    public String login(@RequestParam String login,@RequestParam String password,Map<String, Object> model) {
        Person person = personDao.getByLogin(login);
        String userName;
        Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(object instanceof UserDetails) {
            //UserDetails userDetails = (UserDetails) object;
            userName = ((UserDetails) object).getUsername();
        } else {
            userName = object.toString();
        }
        System.out.println(userName);

        if(person.getPassword().equals(password)) {
            staticIdPerson = person.getId();
            System.out.println(staticIdPerson);
            return "redirect:/tasks";
        }
        System.out.println("Логин или пароль не подошел");
        return "redirect:/my_login";
    }

    @GetMapping("/registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String setPerson(@RequestParam String name,@RequestParam String surName,@RequestParam String login,@RequestParam String password,@RequestParam Long personRole) {
        Person person = new Person(name,surName,login,password,personRole);
        personDao.saveAndFlush(person);
        return "redirect:/my_login";
    }

    @GetMapping("/taskAdd")
    public String taskAdd(Map<String, Object> model) {
    return "taskAdd";
    }

    @PostMapping("/taskAdd")
    public String setTask(@RequestParam String title,@RequestParam String text,@RequestParam Long id,@RequestParam Long personId,Map<String, Object> model) {
        model.put("profile",personDao.getById(staticIdPerson));
        Task task = new Task(title,text,new Date().toString(),new Date().toString(),id,personId,"");
        taskDao.saveAndFlush(task);
        model.put("tasks",taskDao.getById(staticIdPerson));
        return "redirect:/tasks";
    }

    @PostMapping("/deleteTask/{id}")
    public String deleteById(@PathVariable Long id,Map<String, Object> model) {

        taskDao.deleteById(id);
        model.put("tasks",taskDao.getByPersonId(staticIdPerson));
        return "redirect:/tasks";
    }

    @GetMapping("/editTask/{id}")
    public String getTasksById(@PathVariable Long id, Map<String, Object> model) {
        model.put("profile",personDao.getById(staticIdPerson));
        model.put("task",taskDao.getById(id));
        return "editTask";
    }

    @PostMapping("/editTask")
    public String editTask(@RequestParam String title,@RequestParam String text,@RequestParam Long id,Map<String, Object> model) {
        model.put("profile",personDao.getById(staticIdPerson));

        Task task = taskDao.getByIdAndPersonId(id,staticIdPerson);
        if(task == null) {
            return "redirect:/tasks";
        }

        task.setTitle(title);
        task.setText(text);

        taskDao.saveAndFlush(task);
        model.put("tasks",taskDao.findAllByPersonId(staticIdPerson));
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String getTasks(@AuthenticationPrincipal Person person, Map<String, Object> model) {
        model.put("profile",person);
        model.put("tasks",taskDao.findAllByPersonId(person.getId()));
        return "tasks";
    }

}
