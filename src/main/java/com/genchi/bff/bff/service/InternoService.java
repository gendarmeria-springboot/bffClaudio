package com.genchi.bff.bff.service;

import java.util.List;

import com.genchi.bff.bff.dto.InternoDTO;
import com.genchi.bff.bff.exception.BffException;

public interface InternoService {
	
	InternoDTO create(InternoDTO body) throws BffException;

	//InternoDTO read(Integer id) throws ChallengeWebException;
	
	//InternoDTO buscarPorRun(String run) throws ChallengeWebException;
	
	//List<InternoDTO> findByApellidos(String apellidos) throws ChallengeWebException;

	//Boolean update(InternoDTO body) throws ChallengeWebException;

	//Boolean delete(Integer id) throws ChallengeWebException;

}
