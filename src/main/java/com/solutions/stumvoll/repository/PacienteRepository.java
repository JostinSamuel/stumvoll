package com.solutions.stumvoll.repository;

import com.solutions.stumvoll.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> {

    List<Paciente> findAll();
    Optional<Paciente> findById(String id);
    Paciente save(Paciente paciente);
    void deleteById(String id);
}
