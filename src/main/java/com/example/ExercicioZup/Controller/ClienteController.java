package com.example.ExercicioZup.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExercicioZup.Models.ContaCliente;
import com.example.ExercicioZup.Repository.ClienteRepository;

@RestController
@RequestMapping 
public class ClienteController {
@GetMapping (path = "/novocliente")
	public ContaCliente obterCliente() {
		return new ContaCliente( 0, "jorge", "jorgetsiqueira@gmail.com", "987.654.321-00", "20-12-1993");}

	@PostMapping
	@ResponseBody
	@ResponseStatus()
	public ContaCliente adicionar(@PathVariable ContaCliente cliente) {
		return new ContaCliente(0, "Qual seu Nome?:", "Digite seu E-mail:", "Agora, Digite Seu CPF:", "Qual Sua Data de Nascimento:?");}
	
	

	public ClienteRepository getClienteRepository() {
		return null;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
	}
		
	
	
}
	
