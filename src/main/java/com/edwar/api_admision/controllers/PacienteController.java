package com.edwar.api_admision.controllers;

import com.edwar.api_admision.model.dtos.request.PacientesRequestDTO;
import com.edwar.api_admision.services.IPacientesService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    private static final Logger logger = LoggerFactory.getLogger(PacienteController.class);

    @Autowired
    private IPacientesService pacientesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody PacientesRequestDTO body){
        logger.info("create - Inicio");
        return new ResponseEntity<>(pacientesService.create(body) ,HttpStatus.OK);
    }

    @GetMapping("/update")
    public ResponseEntity<?> update(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getById")
    public ResponseEntity<?> getOne(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
