package com.solutions.stumvoll.service;

import com.solutions.stumvoll.model.Paciente;
import com.solutions.stumvoll.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class PacienteServiceImpl implements PacienteRepository{

    
    private final PacienteRepository pacienteRepository;

    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> findById(String id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deleteById(String id) {
        //method to change the status of the patient to inactive
        Paciente paciente = pacienteRepository.findById(id).get();
        paciente.setEstadoPaciente(false);
    }
}
