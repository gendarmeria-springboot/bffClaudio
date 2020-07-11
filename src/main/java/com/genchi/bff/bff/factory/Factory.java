package com.genchi.bff.bff.factory;

import com.genchi.bff.bff.dto.InternoDTO;
import com.genchi.bff.bff.feign.request.InternoFeignRequest;
import com.genchi.bff.bff.feign.response.InternoFeignResponse;

public class Factory {

	
	
	public static InternoFeignRequest getInternoFeignRequest(InternoDTO interno) {
		if (interno == null) {
			return null;
		}
		InternoFeignRequest response = new InternoFeignRequest();
		response.setId(interno.getId());
		response.setNombre(interno.getNombre());
		response.setApellidos(interno.getApellidos());
		response.setIdSexo(interno.getIdSexo());
		response.setEdad(interno.getEdad());
		response.setIdRegion(interno.getIdRegion());
		response.setIdUnidad(interno.getIdUnidad());
		response.setRun(interno.getRun());
		return response;
	}
	
	public static InternoDTO getInternoDTO(InternoFeignResponse internoFeingResponse) {
		if (internoFeingResponse == null) {
			return null;
		}
		InternoDTO response = new InternoDTO();
		response.setId(internoFeingResponse.getId());
		response.setNombre(internoFeingResponse.getNombre());
		response.setApellidos(internoFeingResponse.getApellidos());
		response.setIdSexo(internoFeingResponse.getIdSexo());
		response.setEdad(internoFeingResponse.getEdad());
		response.setIdRegion(internoFeingResponse.getIdRegion());
		response.setIdUnidad(internoFeingResponse.getIdUnidad());
		response.setRun(internoFeingResponse.getRun());
		
		return response;
	}

}
