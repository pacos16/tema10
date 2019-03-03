package com.pacosignes      .ex10;

import java.util.GregorianCalendar;

public class Hijo extends Persona{


    public Hijo(String nombre, GregorianCalendar fechaNacimiento) {
        super(nombre,fechaNacimiento);

    }




    @Override
    public String toString(){
        return String.format("%20s %15s",nombre,fechaNacimiento.toString());
    }


}
