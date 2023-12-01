package com.javatechie.springbootdemoazure.Models;

public class Task {
    private static long taskIdCounter = 1;
    private final long id;
    private String name;
    private String details;
    private String user;

    public Task(String name,
                String details,
                String user) {
        this.id = taskIdCounter++;
        this.name = name;
        this.details = details;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getUser() {
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
