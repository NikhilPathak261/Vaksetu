package com.vaksetu.vaksetu.repository;

import com.vaksetu.vaksetu.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session,Long> {
    List<Session> findByUserId(Long userId);
}