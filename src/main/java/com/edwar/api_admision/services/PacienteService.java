package com.edwar.api_admision.services;

import com.edwar.api_admision.controllers.PacienteController;
import com.edwar.api_admision.model.dtos.entities.PacientesEntity;
import com.edwar.api_admision.model.dtos.request.PacientesRequestDTO;
import com.edwar.api_admision.model.dtos.response.PacientesResposeDTO;
import com.edwar.api_admision.repositories.PacientesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class PacienteService implements IPacientesService {

    private static final Logger logger = LoggerFactory.getLogger(PacienteService.class);

    @Autowired
    private PacientesRepository pacienteRepository;

    @Override
    public PacientesResposeDTO create(PacientesRequestDTO body) {
        logger.info("create - Fin");
        PacientesEntity result = pacienteRepository.save(PacientesEntity.builder()
                .pnombre(body.getPnombre().toUpperCase())
                .snombre(body.getSnombre().toLowerCase())
                .papellido(body.getPapellido())
                .sapellido(body.getSapellido())
                .genero(body.getGenero())
                .fnacimiento(body.getFnacimiento())
                .build());
        logger.info("paciente almacenado - {}",result);
        return new PacientesResposeDTO(result);
    }

}
