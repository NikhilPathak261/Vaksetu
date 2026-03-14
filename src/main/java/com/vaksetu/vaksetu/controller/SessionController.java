package com.vaksetu.vaksetu.controller;

import com.vaksetu.vaksetu.dto.SessionDTO;
import com.vaksetu.vaksetu.model.Session;
import com.vaksetu.vaksetu.service.SessionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session createSession(@Valid @RequestBody SessionDTO sessionDTO){
        return sessionService.createSession(sessionDTO);
    }

    @GetMapping("/{userId}")
    public List<Session> getSessionsByUser(@PathVariable Long userId){
        return sessionService.getSessionsByUserId(userId);
    }
}
