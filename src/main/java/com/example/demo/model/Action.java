package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "action")
public class Action {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "codeAction", unique = true)
	public String codeAction;
	
	@Column(name = "actionMaitrise")
	public String actionMaitrise;
	
	@Column(name = "strategy")
	public String strategy;
	
	@Column(name = "cost")
	public int cost;
	
	@Column(name = "delay")
	public int delay;

	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "date_action")
	public Date date_action; 
	
	@Column(name = "responsable_action")
	public String responsabe_action; 
	
	@Column(name = "avancement")
	public int avancement; 
	
	@Column(name = "efficiency")
	public int efficiency; 
	
	@Column(name = "comment")
	public String comment;


	
	public Action () {
		
	}

	public Action(String codeAction, String actionMaitrise, String strategy, int cost, int delay, Date date_action,
			String responsabe_action, int avancement, int efficiency, String comment) {

		this.codeAction = codeAction;
		this.actionMaitrise = actionMaitrise;
		this.strategy = strategy;
		this.cost = cost;
		this.delay = delay;
		this.date_action = date_action;
		this.responsabe_action = responsabe_action;
		this.avancement = avancement;
		this.efficiency = efficiency;
		this.comment = comment;
	}

	public Action(String codeAction,  String strategy, int cost, int delay, Date date_action,
				  String responsabe_action, int avancement, String comment) {

		this.codeAction = codeAction;
		this.strategy = strategy;
		this.cost = cost;
		this.delay = delay;
		this.date_action = date_action;
		this.responsabe_action = responsabe_action;
		this.avancement = avancement;
		this.comment = comment;
	}






}