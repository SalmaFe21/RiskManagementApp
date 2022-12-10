package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Processus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ProcessusRepository extends JpaRepository<Processus, Long>{
//	List<Processus> getByUserId(long id);
}