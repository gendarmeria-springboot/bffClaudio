package com.genchi.bff.bff.dto;

import com.genchi.bff.bff.dto.InternoDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternoDTO {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer idSexo;
	private Integer edad;
	private Integer idRegion;
	private Integer idUnidad;
	private String run;
	

}
