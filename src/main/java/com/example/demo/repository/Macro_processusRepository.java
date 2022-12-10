package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Macro_processus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Macro_processusRepository extends JpaRepository<Macro_processus, Long>{
//	List<Macro_processus> getByUserId(long id);
}