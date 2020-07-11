package com.genchi.bff.bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genchi.bff.bff.dto.InternoDTO;
import com.genchi.bff.bff.exception.BffException;
import com.genchi.bff.bff.service.InternoService;

@RestController
@RequestMapping(value = "/interno")
@CrossOrigin("*")
public class InternoController {
	
	@Autowired
	private InternoService internoService;
	@PostMapping(value = "/insertar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InternoDTO> create(@RequestBody InternoDTO body) throws BffException {
		InternoDTO response = this.internoService.create(body);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
