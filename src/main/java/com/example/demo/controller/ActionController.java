package com.example.demo.controller;

import com.example.demo.model.Action;

import com.example.demo.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("action")
public class ActionController {

    @Autowired
    ActionService actionService;

    @GetMapping("getAllActions")
    public List<Action> getAll(){
        return actionService.getAllActions();
    }

    @PostMapping("addAction")
    public void addAction(@RequestBody Action action){
        actionService.addAction(action);
    }

    @DeleteMapping("deleteActionById/{id}")
    public void deleteAction(@PathVariable long id){
        actionService.deleteAction(id);
    }

    @PutMapping("updateAction")
    public void updateAction(@RequestBody Action action) {
        actionService.updateAction(action);
    }

    @CrossOrigin
    @PutMapping ("traiterAction")
    public void traiterAction(@RequestBody Action action){
        actionService.traiterRisk(action.codeAction, action.strategy,action.cost,action.date_action,
                action.delay,action.avancement,action.responsabe_action,action.comment);
    }

}

