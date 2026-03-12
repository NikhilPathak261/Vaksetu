package com.vaksetu.vaksetu.service;

import com.vaksetu.vaksetu.model.Session;
import com.vaksetu.vaksetu.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Session createSession(Session session){
        return sessionRepository.save(session);
    }

    public List<Session> getSessionsByUserId(Long userId){
        return sessionRepository.findByUserId(userId);
    }
}
