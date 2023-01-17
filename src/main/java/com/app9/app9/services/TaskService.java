package com.app9.app9.services;

import com.app9.app9.entity.Task;
import com.app9.app9.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTask(long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Iterable<Task> getAllTasksByUser(long userId) {
        return taskRepository.findByUserId(userId);
    }

    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }
}
