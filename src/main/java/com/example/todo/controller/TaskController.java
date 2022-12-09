package com.example.todo.controller;

import com.example.todo.dto.TaskDto;
import com.example.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController("api/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/")
    public ResponseEntity<List<TaskDto>> getCurrentUserTasks(OAuth2AuthenticationToken token) {
//        taskService.findAllCurrentUserTasks(token.getPrincipal().getAttribute("email"));

        log.info(String.valueOf(token.getPrincipal()));
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }
}
