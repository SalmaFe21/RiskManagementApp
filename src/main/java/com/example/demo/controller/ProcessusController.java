package com.example.demo.controller;

import com.example.demo.model.Processus;
import com.example.demo.service.ProcessusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("processus")
public class ProcessusController {

    @Autowired
    ProcessusService processusService;

    @GetMapping("getAllProcessuses")
    public List<Processus> getAll(){
        return processusService.getAllProcessuses();
    }

    @PostMapping ("addProcessus")
    public void addProcessus(@RequestBody Processus processus){
        processusService.addProcessus(processus);
    }

    @PutMapping("updateProcessus")
    public void updateProcessus(@RequestBody Processus processus){
        processusService.UpdateProcessus(processus);
    }

    @DeleteMapping("deleteProcessusById/{id}")
    public void deleteProcessus(@PathVariable long id){
        processusService.deleteProcessus(id);
    }

}
