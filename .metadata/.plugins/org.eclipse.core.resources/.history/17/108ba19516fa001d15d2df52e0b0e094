package com.lorenzi.logistic.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lorenzi.logistic.domain.model.Delivery;
import com.lorenzi.logistic.domain.model.Occurrence;

@Service
public class RegisterOccurrenceService {
	
	@Autowired
	private SearchDeliveryService searchDeliveryService;
	
	@Transactional
	public Occurrence register(Long deliveryId, String detail) {
		Delivery delivery = searchDeliveryService.search(deliveryId);
		
	 return	delivery.addOccurrence(detail);
		
		
		
	}

}
