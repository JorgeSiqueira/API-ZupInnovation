package com.example.ExercicioZup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExercicioZup.Models.ContaCliente;

@Repository
public interface ClienteRepository extends JpaRepository<ContaCliente, Long> {
	

	
	
	

	
}
