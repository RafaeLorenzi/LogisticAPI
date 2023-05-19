package com.lorenzi.logistic.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lorenzi.logistic.domain.model.Client;
import com.lorenzi.logistic.domain.repository.ClientRepository;
import com.lorenzi.logistic.domain.exception.DomainException;

@Service
public class ClientRegisterService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public Client search(Long clientId) {
		return  clientRepository.findById(clientId)
	    		.orElseThrow(() -> new DomainException("Client not found"));
	}
	
	@Transactional
	public Client save(Client client) {
		boolean usedEmail = clientRepository.findByEmail(client.getEmail())
			.stream()
			.anyMatch(existingClient -> !existingClient.equals(client));
		
		if(usedEmail) {
			throw new DomainException("A customer is already registered with this email.");
			
		}
		
		return clientRepository.save(client);
	}
	
	@Transactional
	public void delete(Long clientId) {
		clientRepository.deleteById(clientId);
	}
	
	

}
