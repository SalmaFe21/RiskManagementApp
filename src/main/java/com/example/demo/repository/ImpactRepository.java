package com.example.demo.repository;

import com.example.demo.model.Impact;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ImpactRepository extends JpaRepository<Impact, Long> {
        Impact findImpactById(long id);

    }

