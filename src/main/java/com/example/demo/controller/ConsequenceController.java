package com.example.demo.controller;

import com.example.demo.model.Consequence;
import com.example.demo.service.ConsequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consequence")
public class ConsequenceController {

    @Autowired
    ConsequenceService consequenceService;

    @GetMapping("getAllConsequences")
    public List<Consequence> getAll(){
        return consequenceService.getAllConsequences();
    }

    @PostMapping("addConsequence")
    public void addConsequence(@RequestBody Consequence consequence){
        consequenceService.addConsequence(consequence);
    }

    @PutMapping("updateConsequence")
    public void updateConsequence(@RequestBody Consequence consequence){
        consequenceService.updateConsequence(consequence);
    }

    @DeleteMapping("deleteConsequenceById/{id}")
    public void deleteConsequence(@PathVariable long id){
        consequenceService.deleteConsequence(id);
    }

}
