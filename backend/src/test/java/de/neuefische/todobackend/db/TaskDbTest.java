package de.neuefische.todobackend.db;

import de.neuefische.todobackend.model.Task;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.assertThat;

class TaskDbTest {

    @Test
    @DisplayName("getTaskList")
    public void getTaskListReturnTaskList(){

        //Given
        //Erstelle ein neues Objekt mit dem Namen taskDb vom Typ TaskDb
        TaskDb taskDb = new TaskDb();
        ArrayList<Task> expectedTaskList = new ArrayList<>(List.of(
                new Task("976f37f4-8aa7-481d-ad2c-2120613f3347", "Write tests", "Open"),
                new Task("61084198-b1b7-4d7c-837c-62f458ce765a", "Drink coffee", "IN_Progress"),
                new Task("4f5cf145-d5f7-430f-8e0e-048ea3c1fc68", "Buy milk", "Done")
        ));

        //When
        List<Task> actualTaskList = taskDb.getTaskList();

        //Then
        assertThat(actualTaskList, is(actualTaskList));
    }

    @Test
    @DisplayName("addNewTask")
    public void addNewTaskAndReturnTaskList(){
        //Given
        TaskDb taskDb = new TaskDb();
        Task newTask = new Task("4", "Do Homeworkout", "OPEN");

        //When
        taskDb.addTask(newTask);

        //Then
        assertThat(taskDb.getTaskList(), hasItem(new Task("4", "Do Homeworkout", "OPEN")));
    }



}