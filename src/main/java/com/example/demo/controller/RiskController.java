package com.example.demo.controller;

import com.example.demo.model.Risk;
import com.example.demo.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("risk")
public class RiskController {

    @Autowired
    RiskService riskService;

     @GetMapping("getAllRiskes")
    public List<Risk> getAll(){
        return riskService.getAllRiskes();
    }

    @PostMapping ("addRisk")
    public void addRisk(@RequestBody Risk risk){
        riskService.addRisk(risk);
    }

    @PutMapping("updateRisk")
    public void updateRisk(@RequestBody Risk risk){
        riskService.UpdateRisk(risk);
    }

    @DeleteMapping("deleteRiskById/{id}")
    public void deleteRisk(@PathVariable long id){
        riskService.deleteRisk(id);
    }

    @CrossOrigin
    @PostMapping ("saveidentification")
    public void saveIdentification(@RequestBody Risk risk){
         riskService.saveIdentification(risk.code,risk.nature,risk.owner,risk.consequenceList,risk.causeList, risk.processus);
    }

    @CrossOrigin
    @PutMapping ("analyseRisk")
    public void analyseRisk(@RequestBody Risk risk){
         riskService.analyseRisk(risk.code,risk.frequency, risk.KRI_formula,risk.impact,risk.actionList);

    }
    @CrossOrigin
    @GetMapping ("getRisk")
    public Risk getRisk (String code){
        return  riskService.getRisk(code);
    }


}
