package com.example.todo.service;

import com.example.todo.entity.Task;
import com.example.todo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> findAllCurrentUserTasks(Integer userId) {
        return taskRepository.findAllByAuthor_Id(userId);
    }
}
