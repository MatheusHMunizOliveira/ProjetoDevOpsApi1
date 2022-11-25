package com.br.edu.utfpr.agroapi1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.utfpr.agroapi1.model.Area;

public interface AreaRepository extends JpaRepository<Area, Long> {
    
}
