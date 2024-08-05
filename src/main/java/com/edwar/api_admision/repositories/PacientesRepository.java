package com.edwar.api_admision.repositories;

import com.edwar.api_admision.model.dtos.entities.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {
}
