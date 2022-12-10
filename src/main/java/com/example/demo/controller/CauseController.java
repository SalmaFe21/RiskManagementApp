package com.example.demo.controller;

import com.example.demo.model.Action;
import com.example.demo.model.Cause;
import com.example.demo.service.CauseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cause")
public class CauseController {

    @Autowired
    CauseService causeService;

    @GetMapping("getAllCauses")
    public List<Cause> getAll(){
        return causeService.getAllCauses();
    }

    @PostMapping("addCause")
    public void addCause(@RequestBody Cause cause){
        causeService.addCause(cause);
    }

    @DeleteMapping("deleteCauseById/{id}")
    public void deleteCause(@PathVariable long id){
        causeService.deleteCause(id);
    }

    @PutMapping("updateAction")
    public void updateCause(@RequestBody Cause cause) {
        causeService.updateCause(cause);
    }

}