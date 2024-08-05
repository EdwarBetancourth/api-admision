package com.edwar.api_admision.model.dtos.request;

import com.edwar.api_admision.model.dtos.entities.PacientesEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PacientesRequestDTO {

    public PacientesRequestDTO(PacientesEntity data) {
        this.pnombre = data.getPnombre();
        this.snombre = data.getSnombre();
        this.papellido = data.getPapellido();
        this.sapellido = data.getSapellido();
        this.genero = data.getGenero();
        this.fnacimiento = data.getFnacimiento();
    }

    @NotNull
    private String pnombre;
    private String snombre;
    @NotNull
    private String papellido;
    private String sapellido;
    @NotNull
    private String genero;
    @NotNull
    private Date fnacimiento;

}
