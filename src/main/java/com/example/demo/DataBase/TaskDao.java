package com.example.demo.DataBase;

import com.example.demo.Enity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskDao extends JpaRepository<Task,Long> {

    List<Task> getAllTask();

    void saveTask(Task task);

    Task getById(Integer id);

}
