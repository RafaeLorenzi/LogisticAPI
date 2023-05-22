package com.lorenzi.logistic.domain.service;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lorenzi.logistic.domain.model.Client;
import com.lorenzi.logistic.domain.model.Delivery;
import com.lorenzi.logistic.domain.model.DeliveryStatus;
import com.lorenzi.logistic.domain.repository.DeliveryRepository;

@Service
public class DeliveryRequestService {
	
	@Autowired
	private  ClientRegisterService clientService;
	
	@Autowired
	private DeliveryRepository deliveryRep;
	
	@Transactional
	public Delivery request(Delivery delivery) {
	    Client client = clientService.search(delivery.getClient().getId());
		
		delivery.setClient(client);
		delivery.setStatus(DeliveryStatus.PENDING);
		delivery.setDeliveryDate(OffsetDateTime.now());
		
		return deliveryRep.save(delivery);
		
	}

	

}
