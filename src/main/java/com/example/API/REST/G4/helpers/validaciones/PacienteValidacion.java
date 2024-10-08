package com.example.API.REST.G4.helpers.validaciones;

import com.example.API.REST.G4.modelos.Paciente;

public class PacienteValidacion {

    //inyecccion de dependencias
    //LLAMAR UNA CLASE DENTRO DE OTRA
    private Paciente paciente=new Paciente();

    //CREAR UN METODO PARA CADA DATO QUE DEBO VALIDAR
    public Boolean validarNombre(){
        return true;
    }

    public Boolean validarFechaNacimiento(){
        return true;
    }

    public Boolean validarCiudad(){
        return true;
    }

    public boolean validarCorreo(){
        return true;
    }

    public boolean validarTelefono(){
        return true;
    }

    public boolean validarGrupoIngresos(){
        return true;
    }

    public boolean validarFechaAfiliacion(){
        return true;
    }



}
