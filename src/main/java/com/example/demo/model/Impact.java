package com.example.demo.model;
import java.sql.Date;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "impact")
public class Impact {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "image")
	public int image;
	
	@Column(name = "legal")
	public int legal;
	
	@Column(name = "performance")
	public int performance;
	
	@Column(name = "financial")
	public int financial;
	
	
	
	public Impact () {
		
	}

   public int maxImpact (){
		List<Integer> list = new LinkedList<Integer>();
		list.add(legal);
		list.add(performance);
		list.add(financial);
		list.add(image);


		return Collections.max(list);
   }

	public Impact(int image, int legal, int performance, int financial) {
		
		this.image = image;
		this.legal = legal;
		this.performance = performance;
		this.financial = financial;
	}

	


}

