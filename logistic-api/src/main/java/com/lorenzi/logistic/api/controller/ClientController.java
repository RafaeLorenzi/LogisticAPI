package com.lorenzi.logistic.api.controller;

import java.util.List;

import javax.validation.Valid;

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
import com.lorenzi.logistic.domain.service.ClientRegisterService;




@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientRegisterService clientService;
	
	

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
	public Client addClient(@Valid @RequestBody Client client) {
		
		return clientService.save(client);
		
	}
	@PutMapping("/{clientId}")
	public ResponseEntity<Client> updateClient(@Valid @PathVariable Long clientId, @RequestBody Client client){
		
		if (!clientRepository.existsById(clientId)) {
			return ResponseEntity.notFound().build();
	}
		client.setId(clientId);
		client = clientService.save(client);
		
		return ResponseEntity.ok(client);
		
	}
	@DeleteMapping("/{clientId}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long clientId){
		if (!clientRepository.existsById(clientId)) {
			return ResponseEntity.notFound().build();
	}
		
		clientService.delete(clientId);
		
		return ResponseEntity.noContent().build();
		
	}

}
