package com.example.demo.service;

import com.example.demo.model.Consequence;
import com.example.demo.repository.ConsequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsequenceService {

    @Autowired
    ConsequenceRepository consequenceRepository;

    public List<Consequence> getAllConsequences(){
        return consequenceRepository.findAll();
    }

    public void addConsequence(Consequence consequence){consequenceRepository.save(consequence);}

    public void updateConsequence (Consequence consequence){consequenceRepository.save(consequence);}

    public void deleteConsequence( long id){consequenceRepository.deleteById(id);}


}

