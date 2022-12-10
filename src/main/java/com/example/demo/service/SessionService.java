package com.example.demo.service;

import com.example.demo.model.Session;
import com.example.demo.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    public List<Session> getAllSessions(){
        return sessionRepository.findAll();
    }
    public void addSession (Session session){
        sessionRepository.save(session);
    }
    public void UpdateSession (Session session){
        sessionRepository.save(session);}

    public void deleteSession (long id){
        sessionRepository.deleteById(id);
    }
}