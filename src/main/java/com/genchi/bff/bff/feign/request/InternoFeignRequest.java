package com.genchi.bff.bff.feign.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternoFeignRequest {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer idSexo;
	private Integer edad;
	private Integer idRegion;
	private Integer idUnidad;
	private String run;

}
