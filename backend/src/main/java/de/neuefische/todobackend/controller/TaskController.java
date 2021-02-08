package de.neuefische.todobackend.controller;

import de.neuefische.todobackend.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.neuefische.todobackend.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TaskController {

    private final TaskService taskService;
            //= new TaskService(new TaskDb());

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTaskList(){
        return taskService.getTaskList();
    }

    @PostMapping
    public Task addNewTask(@RequestBody Task newTask){
        return taskService.addTask(newTask);
    }

    /*@DeleteMapping
    public Task deleteTask(){


     */


}
