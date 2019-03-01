package com.pacosignes.ex10;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class DataBase {
    private ArrayList<Empleado> empleados;

    public static void main(String[] args) {
        Empleado e=new Empleado("P","Signes","53626257-D",
                new GregorianCalendar(1992,10,05),30000);
        System.out.println(e.toString());
    }

    //todo buscarpornif
    //todo rangoedad
    //todo Rangosueldo
    //todo hijos menores


}
