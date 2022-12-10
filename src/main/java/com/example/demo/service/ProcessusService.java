package com.example.demo.service;

import com.example.demo.model.Processus;
import com.example.demo.repository.ProcessusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProcessusService {

    @Autowired
    ProcessusRepository processusRepository;

    public List<Processus> getAllProcessuses(){
        return processusRepository.findAll();
    }
    public void addProcessus (Processus processus){
        processusRepository.save(processus);
    }
    public void UpdateProcessus (Processus processus){
        processusRepository.save(processus);}

    public void deleteProcessus (long id){
        processusRepository.deleteById(id);
    }
}
