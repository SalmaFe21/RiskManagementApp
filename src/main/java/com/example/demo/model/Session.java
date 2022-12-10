package com.example.demo.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "session")
public class Session {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "date_connexion")
	public Date date_connexion;
	

	
	
	public Session () {
		
	}


	public Session(Date date_connexion) {
		
		this.date_connexion = date_connexion;
	}




	

	
	
	


	
	


}