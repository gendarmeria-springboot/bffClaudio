package com.genchi.bff.bff.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.genchi.bff.bff.feign.request.InternoFeignRequest;
import com.genchi.bff.bff.feign.response.InternoFeignResponse;

@FeignClient(name = "interno")
public interface InternoFeignClient {
	
	@PostMapping(value = "/interno/insertar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InternoFeignResponse> create(@RequestBody InternoFeignRequest body);
	
	@GetMapping(value = "/interno/actualizar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InternoFeignResponse> update(@RequestBody InternoFeignRequest body);

}
