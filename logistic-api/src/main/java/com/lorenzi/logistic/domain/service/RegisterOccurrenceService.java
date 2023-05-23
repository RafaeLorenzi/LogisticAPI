package com.lorenzi.logistic.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorenzi.logistic.domain.exception.DomainException;
import com.lorenzi.logistic.domain.model.Delivery;
import com.lorenzi.logistic.domain.model.Occurrence;
import com.lorenzi.logistic.domain.repository.DeliveryRepository;

@Service
public class RegisterOccurrenceService {
	
	@Autowired
	private DeliveryRepository deliveryRepository;
	
	public Occurrence register(Long deliveryId, String detail) {
		Delivery delivery = deliveryRepository.findById(deliveryId)
				.orElseThrow(( ) -> new DomainException("Delivery not found"));
		
	 return	delivery.addOccurrence(detail);
		
		
		
	}

}
