package com.example.demo.model;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "processus")
public class Processus {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	@Column(name = "processus", unique = true)
	public String processus;
	@Column(name = "code_processus", unique = true)
	public String code_processus;
	
	@Column(name = "pilote")
	public String pilote;

	@OneToMany
	public List<Risk> riskList;



	
	public Processus(String code_processus, String pilote,List<Risk> riskList) {
		
		this.code_processus = code_processus;
		this.pilote = pilote;
		this.riskList =riskList;
	}


	public Processus () {
		
	}


	



	

	
	
	


	
	


}
