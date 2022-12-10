package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ActionRepository extends JpaRepository<Action, Long>{
	//List<Action> getByUserId(long id);
     Action findActionByCodeAction(String codeAction);
}