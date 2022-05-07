package com.brunobrilhante.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunobrilhante.cursospringboot.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
		
}
