package com.genchi.bff.bff.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genchi.bff.bff.command.InternoCommand;
import com.genchi.bff.bff.dto.InternoDTO;
import com.genchi.bff.bff.exception.BffException;
import com.genchi.bff.bff.factory.Factory;
import com.genchi.bff.bff.feign.request.InternoFeignRequest;
import com.genchi.bff.bff.service.InternoService;


@Service
public class InternoServiceImpl implements InternoService{
	@Autowired
	private InternoCommand internoCommand;
	
	@Override
	public InternoDTO create(InternoDTO body) throws BffException {
		
		InternoFeignRequest internoFeignRequest = Factory.getInternoFeignRequest(body);
		InternoDTO response = this.internoCommand.create(internoFeignRequest);
		
		return response;
	}
	/*@Override
	public InternoDTO read(Integer id) {
		Optional<InternoEntity> internoEntity = this.internoRepository.findById(id);
		if (!internoEntity.isPresent()) {
			return null;
		}
		InternoDTO response = Factory.getInternoDTO(internoEntity.get());
		return response;
	}
	
	@Override
	public InternoDTO buscarPorRun(String run) {
		Optional<InternoEntity> internoEntity = Optional.ofNullable(this.internoRepository.findByRun(run));
		if (!internoEntity.isPresent()) {
			return null;
		}
		InternoDTO response = Factory.getInternoDTO(internoEntity.get());
		return response;
	}
	
	@Override
	public List<InternoDTO> findByApellidos(String apellidos) {
		List<InternoEntity> internoEntity = this.internoRepository.findByApellidos(apellidos);
		
		if (!internoEntity.isPresent()) {
			return null;
		}
		
		//for 
		InternoDTO internosDTO = new InternoDTO();
		List<InternoDTO> response = new ArrayList<>();
		for(int i = 0; i < internoEntity.size(); i++) {
			System.out.println("apellidos "+internoEntity.get(i).getApellidos());
			System.out.println("nombres "+internoEntity.get(i).getNombre());
			internosDTO = Factory.getInternoDTO(internoEntity.get(i));
			response.add(internosDTO);
		}
		return response;
	}

	@Override
	public Boolean update(InternoDTO body) {
		System.out.print("impl "+ body);
		InternoEntity internoEntityNew = Factory.getInternoEntity(body);
		//InmateEntity entity = null;
		InternoEntity internoEntity = this.internoRepository.save(internoEntityNew);
		if (internoEntity == null) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean delete(Integer id) {
		this.internoRepository.deleteById(id);
		return true;
	}*/
}
