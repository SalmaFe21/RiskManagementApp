package com.example.demo.service;

import com.example.demo.model.Macro_processus;
import com.example.demo.repository.Macro_processusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MacroProcessusService {

    @Autowired
    Macro_processusRepository macroProcessusRepository;

    public List<Macro_processus> getAllMacroProcessuses(){
        return macroProcessusRepository.findAll();
    }
    public void addMacroProcessus (Macro_processus macroProcessus){
        macroProcessusRepository.save(macroProcessus);
    }
    public void updateMacroProcessus (Macro_processus macroProcessus){
        macroProcessusRepository.save(macroProcessus);}

    public void deleteMacroProcessus (long id){
        macroProcessusRepository.deleteById(id);
    }
}
