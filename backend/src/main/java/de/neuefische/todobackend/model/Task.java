package de.neuefische.todobackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Task {

     String id;
     String description;
     String status;
}
