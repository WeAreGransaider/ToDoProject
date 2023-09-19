package com.example.demo.Controler;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.DataBase.PersonDao;
import com.example.demo.DataBase.TaskDao;
import com.example.demo.Enity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.Map;

@Controller
public class MainControler{

    private TaskDao taskDao;

    public MainControler(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    //    private final PersonDao personDao;
//
//    public MainControler(PersonDao personDao) {
//        this.personDao = personDao;
//        //System.out.println("!!!!!!!!!!!!!!!!!!!!!");
//    }
//
//    @GetMapping
//    public String welcome(Map<String, Object> model) {
//        return "main";
//    }
//
//    @GetMapping("/info/{id}")
//    public PersonDTO info(@PathVariable("id") int id) {
//        PersonDTO personDTO = PersonDTO.personDTOConvertor(personDao.findPerson(id));
//        //System.out.println(personDTO);
//        return personDTO;
//    }
//
//    @PutMapping("/info")
//    public String infoPut() {
//        return "Ответ на put запрос";
//    }

    @GetMapping
    public String loginFirst(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/login")
    public String login(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/taskAdd")
    public String taskAdd(Map<String, Object> model) {
    return "taskAdd";
    }

    @GetMapping("/tasks")
    public String getTasks(Map<String, Object> model) {
        model.put("tasks",taskDao.getAllTask());
        return "tasks";
    }


}



//@Controller
//public class MainController {
//
//
//
//
//
//}
