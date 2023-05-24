package com.lorenzi.logistic.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorenzi.logistic.domain.exception.DomainException;
import com.lorenzi.logistic.domain.exception.EntityNotFoundException;
import com.lorenzi.logistic.domain.model.Delivery;
import com.lorenzi.logistic.domain.repository.DeliveryRepository;

@Service
public class SearchDeliveryService {
	
	@Autowired
	private DeliveryRepository deliveryRepository;
	
	public Delivery search(Long deliveryId) {
		return deliveryRepository.findById(deliveryId)
				.orElseThrow(() -> new EntityNotFoundException("Delivery not found"));
	}

}
