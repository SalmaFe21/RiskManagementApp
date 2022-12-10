package com.example.demo.model;
import java.sql.Date;

import javax.persistence.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "risk")
public class Risk {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "code", unique = true)
	public String code;
	
	@Column(name = "nature")
	public String nature;
	
	@Column(name = "owner")
	public String owner;
	
	@Column(name = "frenquency")
	public int frequency;
	
	@Column(name = "KRI_formula")
	public int KRI_formula;

	@OneToMany(cascade = {CascadeType.ALL})
	public List<Consequence> consequenceList;

	@OneToMany(cascade = {CascadeType.ALL})
	public List<Cause> causeList;

	@OneToOne(orphanRemoval = true, cascade = {CascadeType.ALL})
	public Impact impact;

	@OneToMany(cascade = {CascadeType.ALL})
	public List<Action> actionList;



	@OneToOne(orphanRemoval = true, cascade = {CascadeType.ALL})
	@JoinColumn(name = "processus_id")
	public Processus processus;

   @Column(name = "riskBrut")
	public int riskBrut;

   @Column(name = "riskNet")
   public String riskNet;

	public  int maxeff(){
		List<Integer> liste = new LinkedList<>();
		for(int i=0; i<actionList.size(); i++){
			liste.add(actionList.get(i).efficiency);

		}

		return Collections.max(liste);
	}


	public Risk () {
		
	}

	public Risk(String code, String nature, String owner, int frequency, int kRI_formula, List<Consequence> consequenceList
			,List<Cause> causeList, Impact impact, List<Action> actionList) {
		
		this.code = code;
		this.nature = nature;
		this.owner = owner;
		this.frequency = frequency;
		this.KRI_formula = kRI_formula;
		this.causeList = causeList;
		this.consequenceList = consequenceList;
		this.impact= impact;
		this.actionList=actionList;

	}

	public Risk(String code, String nature, String owner, List<Consequence> consequenceList,List<Cause> causeList, Processus processus) {

		this.code = code;
		this.nature = nature;
		this.owner = owner;
		this.causeList = causeList;
		this.consequenceList = consequenceList;
		this.processus=processus;


	}

	public Risk(String code,int frequency,int kRI_formula ,Impact impact, List<Action> actionList) {

		this.code = code;
		this.frequency = frequency;
		this.KRI_formula = kRI_formula;
		this.impact = impact;
		this.actionList = actionList;


	}




	
	


	
	


}
