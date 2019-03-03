package com.pacosignes.ex10;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empleado extends Persona {
    private static int idStatic=0;
    private int idEmpleado;
    private double sueldo;
    private ArrayList<Hijo> hijos;

    public Empleado(String nombre, String apellido, String dni, GregorianCalendar fechaNacimiento, double sueldo) {
        super(nombre,apellido,dni,fechaNacimiento);
        this.sueldo = sueldo;
        this.idEmpleado=idStatic;
        hijos=new ArrayList<>(3);
        idStatic++;
    }
    public boolean anyadirHijo(Hijo h){
        return hijos.add(h);
    }

    public boolean eliminarHijo(String nombre){
        if (hijos.size()!=0){
            for(int i =0; i<hijos.size();i++){
                if (nombre.equals(hijos.get(i).getNombre())){
                    hijos.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString(){

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr=dateFormat.format(fechaNacimiento.getTime());
        //String.format("%-15s %-15s %-12s %-12s %-10 ","Nombre","Apellido","DNI","Fecha Nacimiento", "Sueldo");
        return String.format("%-15s %-15s %-12s %-16s %-10.2f€\n",nombre,apellido1,dni,fechaStr,sueldo);
    }


    //todo manejar hijos boolean getEdad
    //todo manejar hijos getNombre
    //todo manejar hijos toString
}
