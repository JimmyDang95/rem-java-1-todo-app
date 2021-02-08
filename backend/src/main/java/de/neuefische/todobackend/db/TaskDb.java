package de.neuefische.todobackend.db;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import de.neuefische.todobackend.model.*;
import de.neuefische.todobackend.service.*;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TaskDb {
    private List<Task> taskList = new ArrayList<>(List.of(
            new Task("976f37f4-8aa7-481d-ad2c-2120613f3347", "Write tests", "OPEN"),
            new Task("61084198-b1b7-4d7c-837c-62f458ce765a", "Drink coffee", "IN_PROGRESS"),
            new Task("4f5cf145-d5f7-430f-8e0e-048ea3c1fc68", "Buy milk", "DONE")
    ));

    public List<Task> getTaskList(){

        return taskList;
    }

    public Task addTask(@RequestBody Task newTask){
        taskList.add(newTask);
        return newTask;
    }

    public Task deleteTask(@RequestBody Task){
        taskList.de
    }


}
