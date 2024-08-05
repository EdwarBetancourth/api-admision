package com.edwar.api_admision.model.dtos.response;

import com.edwar.api_admision.model.dtos.entities.PacientesEntity;
import com.edwar.api_admision.model.dtos.request.PacientesRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacientesResposeDTO extends PacientesRequestDTO {

    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PacientesResposeDTO(PacientesEntity data) {
        super(data);
        this.id = data.getId();
        this.createdAt = data.getCreatedAt();
        this.updatedAt = data.getUpdatedAt();
    }

}

