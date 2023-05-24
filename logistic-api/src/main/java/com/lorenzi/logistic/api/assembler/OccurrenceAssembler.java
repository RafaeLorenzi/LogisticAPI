package com.lorenzi.logistic.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lorenzi.logistic.api.model.OccurrenceModel;
import com.lorenzi.logistic.domain.model.Occurrence;

@Component
public class OccurrenceAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public OccurrenceModel toModel(Occurrence occurrence) {
		return modelMapper.map(occurrence, OccurrenceModel.class);
	}
	
	
	public List<OccurrenceModel> toCollectionModel(List<Occurrence> occurrence){
		return occurrence.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	

}
