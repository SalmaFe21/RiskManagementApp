package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.RiskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RiskService {

    @Autowired
    RiskRepository riskRepository;



    public List<Risk> getAllRiskes() {
        return riskRepository.findAll();
    }

    public void addRisk(Risk risk) {
        riskRepository.save(risk);
    }

    public void UpdateRisk(Risk risk) {
        riskRepository.save(risk);
    }

    public void deleteRisk(long id) {
        riskRepository.deleteById(id);
    }

    public void saveIdentification(String code, String nature, String owner,
                                   List<Consequence> consequenceList, List<Cause> causeList, Processus processus) {
        Risk risk = new Risk(code, nature, owner,
                consequenceList, causeList, processus);
        riskRepository.save(risk);

    }

    public Risk findRiskByCode(String code) {
        return riskRepository.findRiskByCode(code);


    }
    public Risk getRisk (String code ){
        return riskRepository.findRiskByCode(code);

    }

   public int calculerRiskBrut (int frequency, Impact impact){
        int maxImpact = impact.maxImpact();
        return frequency*maxImpact;
   }


    public int RiskBrut (int frequency, Impact impact){
        int criticity = calculerRiskBrut(frequency, impact);
        if(criticity<=2){return 1;}
        else if (criticity>2 && criticity<=4){return 2;}
        else if (criticity>4 && criticity<=9){return 3;}
        else if (criticity>9 && criticity<=14){return 4;}
        else if (criticity>14 && criticity<=25){return 5;}
        else{return 0;}
    };

    public void analyseRisk(String code, int frequency, int kRI_formula
            , Impact impact, List<Action> actionList) {
        int riskBrut = RiskBrut(frequency, impact);
        Risk updatedRisk = findRiskByCode(code);
        updatedRisk.frequency = frequency;
        updatedRisk.impact = impact;
        updatedRisk.KRI_formula = kRI_formula;
        updatedRisk.actionList = actionList;
        updatedRisk.riskBrut = riskBrut;
        int evaluation = updatedRisk.maxeff();
        switch (Integer.toString(riskBrut) + "_" + Integer.toString(evaluation)){
            case "4_1","4_2","5_1","5_2": updatedRisk.riskNet = "A" ; break;
            case "3_1","3_2","3_3","4_3","5_3": updatedRisk.riskNet = "B"; break;
            case "4_4","4_5","5_4","5_5": updatedRisk.riskNet = "C"; break;
            case "1_4","1_5","2_4","2_5": updatedRisk.riskNet = "D"; break;
            case "1_3","2_3","3_4","3_5": updatedRisk.riskNet = "E"; break;
            case "1_1","1_2","2_1","2_2": updatedRisk.riskNet = "F"; break;

        };

        riskRepository.save(updatedRisk);

    }

}
