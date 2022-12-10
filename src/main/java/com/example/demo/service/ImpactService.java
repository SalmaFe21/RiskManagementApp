package com.example.demo.service;

import com.example.demo.model.Impact;
import com.example.demo.repository.ImpactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpactService {

    @Autowired
    ImpactRepository impactRepository;

    public List<Impact> getAllImpacts(){
        return impactRepository.findAll();
    }

    public void addImpact(Impact impact){
        impactRepository.save(impact);
    }

    public void updateImpact(Impact impact){
        impactRepository.save(impact);
    }

    public void deleteImpact(long id){
        impactRepository.deleteById(id);
    }


    public Impact getImpact(long id) {
        return impactRepository.findImpactById(id);
    }
}
