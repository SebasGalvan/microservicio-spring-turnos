package com.todocodeacademy.turnos.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;
}
