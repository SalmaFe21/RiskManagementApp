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
@Table(name = "cause")
public class Cause {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	

	
	@Column(name = "description")
	public String description;
	
	
	
	public Cause () {
		
	}



	public Cause(String description) {
		
		this.description = description;
	}


	


}