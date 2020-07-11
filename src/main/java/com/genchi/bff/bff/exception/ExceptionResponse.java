package com.genchi.bff.bff.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import com.genchi.bff.bff.exception.ExceptionResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
	
	private Date timestamp;
	private String message;
	private String detail;
	private  HttpStatus Error;

}
