package com.lorenzi.logistic.api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lorenzi.logistic.domain.model.Client;
import com.lorenzi.logistic.domain.repository.ClientRepository;




@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	

	@GetMapping
	public List<Client> list() {
	
		return clientRepository.findAll();
	}
	
	@GetMapping("/{clientId}")
	public ResponseEntity<Client> clientById(@PathVariable Long clientId) {
		
		return clientRepository.findById(clientId)
	
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
				
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client addClient(@RequestBody Client client) {
		
		return clientRepository.save(client);
		
	}
	@PutMapping("/{clientId}")
	public ResponseEntity<Client> updateClient(@PathVariable Long clientId, @RequestBody Client client){
		
		if (!clientRepository.existsById(clientId)) {
			return ResponseEntity.notFound().build();
	}
		client.setId(clientId);
		client = clientRepository.save(client);
		
		return ResponseEntity.ok(client);
		
	}
	@DeleteMapping("/{clientId}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long clientId){
		if (!clientRepository.existsById(clientId)) {
			return ResponseEntity.notFound().build();
	}
		
		clientRepository.deleteById(clientId);
		
		return ResponseEntity.noContent().build();
		
	}

}
