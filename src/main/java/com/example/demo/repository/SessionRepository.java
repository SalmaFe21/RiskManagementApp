package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{
//	List<Session> getByUserId(long id);
}