package com.solutions.stumvoll.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    private String id;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private Integer edad;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    private String pais;
    private String fechaNacimiento;
    private String sexo;
    private String ocupacion;
    private String estadoCivil;
    private Boolean tieneHijos;
    private Integer cantidadHijos;
    private Boolean estadoPaciente;
}
