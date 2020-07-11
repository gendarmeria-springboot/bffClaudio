package com.genchi.bff.bff.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.genchi.bff.bff.dto.InternoDTO;
import com.genchi.bff.bff.exception.BffException;
import com.genchi.bff.bff.factory.Factory;
import com.genchi.bff.bff.feign.client.InternoFeignClient;
import com.genchi.bff.bff.feign.request.InternoFeignRequest;
import com.genchi.bff.bff.feign.response.InternoFeignResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class InternoCommand {

	@Autowired
	private InternoFeignClient internoFeignClient;
	
	@HystrixCommand(fallbackMethod = "internoError")
	public InternoDTO create(InternoFeignRequest internoFeignRequest) throws BffException {

		// Invocando al end point auth/login -> (ms auth)
		ResponseEntity<InternoFeignResponse> responseEntity = this.internoFeignClient.create(internoFeignRequest);

		// Obteniendo el json de respuesta (DTO) del endpoint auth/login -> (ms auth)
		InternoFeignResponse internoFeingResponse = responseEntity.getBody();

		// Retorno del mapeo de respuesta al service.
		return Factory.getInternoDTO(internoFeingResponse);
	}
	@HystrixCommand(fallbackMethod = "internoError")
	public boolean update(InternoFeignRequest internoFeignRequest) throws BffException {

		// Invocando al end point auth/login -> (ms auth)
		ResponseEntity<InternoFeignResponse> responseEntity = this.internoFeignClient.update(internoFeignRequest);

		// Obteniendo el json de respuesta (DTO) del endpoint auth/login -> (ms auth)
		InternoFeignResponse internoFeingResponse = responseEntity.getBody();
		if (internoFeingResponse == null) {
			return false;
		}
		return true;
		// Retorno del mapeo de respuesta al service.
	}
	
	
	
	public InternoDTO internoError(InternoFeignRequest internoFeignRequest) throws BffException {
		throw new BffException("Error en la comunicación con Interno MS", HttpStatus.NOT_FOUND);
	}
	
}
