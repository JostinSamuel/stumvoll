package com.solutions.stumvoll.controller;

import com.solutions.stumvoll.model.Paciente;
import com.solutions.stumvoll.service.PacienteServiceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/paciente")
public class PacienteController {


    @GetMapping("/listaPacientes")
    public List<Paciente> obtenerListaPacientes() {
        return Arrays.asList(
            new Paciente("1", "Juan", "Perez", "DNI", "12345678", 30, "123456789", "juan.perez@example.com", "Calle Falsa 123", "Lima", "Peru", "1990-01-01", "M", "Ingeniero", "Casado", true, 2, true),
            new Paciente("2", "Ana", "Gomez", "DNI", "87654321", 25, "987654321", "ana.gomez@example.com", "Avenida Siempre Viva 456", "Bogota", "Colombia", "1995-02-02", "F", "Doctora", "Soltera", false, 0, true),
            new Paciente("3", "Pedro", "Rodriguez", "DNI", "11223344", 45, "1122334455", "pedro.rodriguez@example.com", "Plaza Mayor 789", "Madrid", "España", "1975-03-03", "M", "Abogado", "Divorciado", true, 1, false)
        );
    }

}
