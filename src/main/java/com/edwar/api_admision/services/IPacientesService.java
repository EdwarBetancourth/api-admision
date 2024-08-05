package com.edwar.api_admision.services;

import com.edwar.api_admision.model.dtos.request.PacientesRequestDTO;
import com.edwar.api_admision.model.dtos.response.PacientesResposeDTO;
import org.springframework.http.ResponseEntity;

public interface IPacientesService {

    public PacientesResposeDTO create(PacientesRequestDTO body);
}
