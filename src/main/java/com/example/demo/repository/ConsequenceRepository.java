package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Consequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ConsequenceRepository extends JpaRepository<Consequence, Long>{
//	List<Consequence> getByUserId(long id);
}