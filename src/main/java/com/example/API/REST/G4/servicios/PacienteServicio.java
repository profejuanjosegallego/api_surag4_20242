package com.example.API.REST.G4.servicios;

import com.example.API.REST.G4.modelos.Paciente;
import com.example.API.REST.G4.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;

public class PacienteServicio {

    //Para usar un servicio debo llamar al repositorio
    //INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //Listo las operaciones que voy a realizar en BD

    //registrarPaciente
    public Paciente registrarPaciente(Paciente datosPaciente){
        return null;
    }

    //buscarPacientes

    //buscarUnPacientePorId

}
