package de.neuefische.todobackend.service;

import de.neuefische.todobackend.db.TaskDb;
import de.neuefische.todobackend.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class TaskService {

    @Autowired
    public TaskService(TaskDb taskServiceTaskDb) {
        this.taskServiceTaskDb = taskServiceTaskDb;
    }

    private TaskDb taskServiceTaskDb;

    public List<Task> getTaskList(){
        return taskServiceTaskDb.getTaskList();
    }

    public Task addTask(@RequestBody Task newTask){
        return taskServiceTaskDb.addTask(newTask);
    }

}
