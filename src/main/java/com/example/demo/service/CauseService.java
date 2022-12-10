package com.example.demo.service;

import com.example.demo.model.Action;
import com.example.demo.model.Cause;
import com.example.demo.repository.CauseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauseService {

    @Autowired
    CauseRepository causeRepository;

    public List<Cause> getAllCauses(){
        return causeRepository.findAll();
    }

    public void addCause(Cause cause ){causeRepository.save(cause); }

    public void updateCause(Cause cause){causeRepository.save(cause);}

    public void deleteCause( long id){
        causeRepository.deleteById(id);
    }

}