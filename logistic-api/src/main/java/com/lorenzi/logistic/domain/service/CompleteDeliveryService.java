package com.lorenzi.logistic.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lorenzi.logistic.domain.model.Delivery;
import com.lorenzi.logistic.domain.repository.DeliveryRepository;

@Service
public class CompleteDeliveryService {
	
	@Autowired
	private SearchDeliveryService searchDeliveryService;
	@Autowired 
	private DeliveryRepository deliveryRepository;
	
	
	@Transactional
	public void completeDelivery(Long deliveryId) {
		Delivery delivery = searchDeliveryService.search(deliveryId);
		
		
		delivery.complete();
		
		deliveryRepository.save(delivery);
		
	}

}
