package com.lorenzi.logistic.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lorenzi.logistic.api.model.DeliveryModel;
import com.lorenzi.logistic.api.model.input.DeliveryInput;
import com.lorenzi.logistic.domain.model.Delivery;

@Component
public class DeliveryAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public DeliveryModel toModel(Delivery delivery) {
		return modelMapper.map(delivery, DeliveryModel.class);
	}
	
	
	public List<DeliveryModel> toCollectionModel(List<Delivery> delivery){
		return delivery.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}

	public Delivery toEntity(DeliveryInput deliveryInput) {
		return modelMapper.map(deliveryInput, Delivery.class);
	}
}
