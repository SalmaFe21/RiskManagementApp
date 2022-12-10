package com.example.demo.service;

import com.example.demo.model.Action;
import com.example.demo.model.Risk;
import com.example.demo.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class ActionService {

    @Autowired
    ActionRepository actionRepository;

    public List<Action> getAllActions(){
        return actionRepository.findAll();
    }

    public void addAction(Action action){
        actionRepository.save(action);
    }

    public void updateAction(Action action){
        actionRepository.save(action);
    }

    public void deleteAction( long id){
        actionRepository.deleteById(id);
    }
    public Action findActionByCode(String code) {
        return actionRepository.findActionByCodeAction(code);


    }


    public void traiterRisk (String codeAction, String strategy, int cost, Date dateLancement, int delay,
                             int avancement, String responsableAction, String comment){


        Action updatedAction = findActionByCode(codeAction);



        updatedAction.strategy= strategy;
        updatedAction.cost= cost;
        updatedAction.date_action= (java.sql.Date) dateLancement;
        updatedAction.delay=delay;
        updatedAction.avancement=avancement;
        updatedAction.responsabe_action=responsableAction;
        updatedAction.comment=comment;




    }


}
