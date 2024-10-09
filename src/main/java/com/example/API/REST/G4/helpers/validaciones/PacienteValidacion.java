package com.example.API.REST.G4.helpers.validaciones;

import com.example.API.REST.G4.modelos.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PacienteValidacion {

    //inyecccion de dependencias
    //LLAMAR UNA CLASE DENTRO DE OTRA
    private Paciente paciente=new Paciente();

    //CREAR UN METODO PARA CADA DATO QUE DEBO VALIDAR
    public Boolean validarNombre(String nombre){

        String expresionregular="^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$ ";
        Pattern patron=Pattern.compile(expresionregular);
        Matcher coincidencia=patron.matcher(nombre);
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }

    }

    public Boolean validarFechaNacimiento(LocalDate fecha){
        if(fecha.getYear()>2024 || fecha.getYear()<1920){
            return false;
        }else{
            return true;
        }
    }

    public Boolean validarCiudad(){
        return true;
    }

    public Boolean validarCorreo(){
        return true;
    }

    public Boolean validarTelefono(String telefono){
        if(telefono.length()!=10){
            return false;
        }else{
            return true;
        }
    }

    public Boolean validarGrupoIngresos(String grupoIngresos){

        if(grupoIngresos.toUpperCase().equals("A") || grupoIngresos.toUpperCase().equals("B") || grupoIngresos.toUpperCase().equals("C") ){
            return true;
        }else{
            return false;
        }

    }

    //95/2024
    public Boolean validarFechaAfiliacion(LocalDate fecha){

        if(fecha.getYear()>1995 && fecha.getYear()<2024){
            return true;
        }else{
            return false;
        }
    }



}
