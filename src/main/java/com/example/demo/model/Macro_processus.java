package com.example.demo.model;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "macro_processus")
public class Macro_processus {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	
	
	
	@Column(name = "responsable")
	public String responsable;
	 @OneToMany
	 public List<Processus> processusList;



	public Macro_processus(String responsable, List<Processus> processusList) {

		this.responsable = responsable;
		this.processusList=processusList;
	}











	public Macro_processus () {
		
	}
	
	
}	