package com.example.demo.controller;

import com.example.demo.model.Session;
import com.example.demo.repository.SessionRepository;
import com.example.demo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("session")
public class SessionController {

    @Autowired
    SessionService sessionService;

    @GetMapping("getAllSessions")
    public List<Session> getAll(){
        return sessionService.getAllSessions();
    }

    @PostMapping ("addSession")
    public void addSession(@RequestBody Session session){
        sessionService.addSession(session);
    }

    @PutMapping("updateSession")
    public void updateSession(@RequestBody Session session){
        sessionService.UpdateSession(session);
    }

    @DeleteMapping("deleteSessionById/{id}")
    public void deleteSession(@PathVariable long id){
        sessionService.deleteSession(id);
    }

}
