package com.javatechie.springbootdemoazure;

import com.javatechie.springbootdemoazure.Models.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TaskTest {

    @Test
    void addTaskNameTest(){
        Task task = new Task("Task1", "Details1", "User1");
        task.setName("Task1");

        assertEquals("Task1", task.getName());
    }


}
