package com.vaksetu.vaksetu.service;

import com.vaksetu.vaksetu.dto.SessionDTO;
import com.vaksetu.vaksetu.model.Session;
import com.vaksetu.vaksetu.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Session createSession(SessionDTO sessionDTO){

        Session session = new Session();
        session.setTopic(sessionDTO.getTopic());
        session.setScore(sessionDTO.getScore());
        session.setFeedback(sessionDTO.getFeedback());
        session.setUserId(sessionDTO.getUserId());
        return sessionRepository.save(session);
    }

    public List<Session> getSessionsByUserId(Long userId){
        return sessionRepository.findByUserId(userId);
    }
}
