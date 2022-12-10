package com.example.demo.controller;

import com.example.demo.model.Impact;
import com.example.demo.service.ImpactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("impact")
public class ImpactController {

    @Autowired
    ImpactService impactService;

    @GetMapping("getAllImpacts")
    public List<Impact> getAll(){
        return  impactService.getAllImpacts();
    }

    @PostMapping("addImpact")
    public void addImpact(@RequestBody Impact impact){
        impactService.addImpact(impact);
    }

    @PutMapping("updateImpact")
    public void updateImpact(@RequestBody Impact impact){
        impactService.updateImpact(impact);
    }

    @DeleteMapping("deleteImpactById/{id}")
    public void deleteImpact(@PathVariable long id){
        impactService.deleteImpact(id);
    }

    @CrossOrigin
    @GetMapping("getImpact")
    public Impact getImpact(long id) {
        return impactService.getImpact(id);
    }

}
