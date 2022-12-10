package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Cause;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CauseRepository extends JpaRepository<Cause, Long>{
//	List<Cause> getByUserId(long id);
}