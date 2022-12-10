package com.example.demo.controller;

import com.example.demo.model.Macro_processus;
import com.example.demo.service.MacroProcessusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("macroProcessus")
public class MacroProcessusController {

    @Autowired
    MacroProcessusService macroProcessusService;

    @GetMapping("getAllMacroProcessuses")
    public List<Macro_processus> getAll(){
        return macroProcessusService.getAllMacroProcessuses();
    }

    @PostMapping("addMacroProcessus")
    public void addMacroProcessus(@RequestBody Macro_processus macroProcessus){
        macroProcessusService.addMacroProcessus(macroProcessus);
    }

    @PutMapping("updateMacroPocessus")
    public void updateMacroProcessus(@RequestBody Macro_processus macroProcessus){
        macroProcessusService.updateMacroProcessus(macroProcessus);
    }

    @DeleteMapping("deleteMacroProcessusById/{id}")
    public void deleteMacroProcessus(long id){
        macroProcessusService.deleteMacroProcessus(id);
    }


}
