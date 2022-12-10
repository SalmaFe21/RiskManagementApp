package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface UserServiceOldOne {
	
	void seConnecter(String matricule, String password);
	@Query(value = "Select u from User u where u.matricule = :matricule")
	User findUserByMatricule(@Param("matricule") String matricule) ;
	
	
}

