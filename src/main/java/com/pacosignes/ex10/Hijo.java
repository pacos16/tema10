package com.pacosignes.ex10;

import java.util.GregorianCalendar;

public class Hijo {
    private String nombre;
    private GregorianCalendar fechaNacimiento;

    public Hijo(String nombre, GregorianCalendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    //todo getEdad;


    @Override
    public String toString(){
        return String.format("%20s %15s",nombre,fechaNacimiento.toString());
    }


}
