package com.app9.app9.exeption;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(long taskId) {
        super("Task not found with id " + taskId);
    }
}