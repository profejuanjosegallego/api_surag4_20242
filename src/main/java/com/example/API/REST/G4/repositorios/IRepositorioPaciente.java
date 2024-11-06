package com.example.API.REST.G4.repositorios;

import com.example.API.REST.G4.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioPaciente extends JpaRepository<Paciente,Long> {

}
