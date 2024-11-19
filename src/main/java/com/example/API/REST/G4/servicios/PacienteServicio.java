package com.example.API.REST.G4.servicios;

import com.example.API.REST.G4.modelos.Paciente;
import com.example.API.REST.G4.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    //Para usar un servicio debo llamar al repositorio
    //INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //Listo las operaciones que voy a realizar en BD

    //registrarPaciente
    public Paciente registrarPaciente(Paciente datosPaciente) throws Exception{
        try{
            //Guardar en bd los datos del paciente
            return iRepositorioPaciente.save(datosPaciente);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //buscarPacientes
    public List<Paciente> buscarPacientes() throws Exception{
        try{
            return iRepositorioPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscarUnPacientePorId

}
