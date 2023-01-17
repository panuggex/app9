package com.app9.app9.controllers;

import com.app9.app9.entity.User;
import com.app9.app9.exeption.TaskNotFoundException;
import com.app9.app9.exeption.UserNotFoundException;
import com.app9.app9.repository.TaskRepository;
import com.app9.app9.repository.UserRepository;
import com.app9.app9.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskService taskService, UserRepository userRepository, TaskRepository taskRepository) {
        this.taskService = taskService;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    @PostMapping("/{userId}/tasks")
    public com.app9.app9.entity.Task createTask(@PathVariable("userId") long userId, @RequestBody com.app9.app9.entity.Task task) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        task.setUser(user);
        return taskService.createTask(task);
    }



    @PutMapping("/{taskId}")
    public ResponseEntity<com.app9.app9.entity.Task> updateTask(@PathVariable long userId, @PathVariable long taskId, @RequestBody com.app9.app9.entity.Task taskDetails) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        com.app9.app9.entity.Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new TaskNotFoundException(taskId));

        task.setName(taskDetails.getName());
        task.setDescription(taskDetails.getDescription());
        task.setDateTime(taskDetails.getDateTime());
        task.setUser(user);
        taskRepository.save(task);
        return ResponseEntity.ok(task);
    }


    @GetMapping("/{userId}/tasks")
    public Iterable<com.app9.app9.entity.Task> getAllTasksByUser(@PathVariable long userId) {
        return taskService.getAllTasksByUser(userId);
    }


    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable long taskId) {
        taskService.deleteTask(taskId);
    }
}
