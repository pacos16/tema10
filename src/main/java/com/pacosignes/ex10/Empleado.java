package com.pacosignes.ex10;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private GregorianCalendar fechaNacimiento;
    private double sueldo;
    private ArrayList<Hijo> hijos;

    public Empleado(String nombre, String apellido, String dni, GregorianCalendar fechaNacimiento, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }
    public int getEdad(){
        return 10;

    }

    @Override
    public String toString(){

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mm-yyyy");
        dateFormat.setCalendar(fechaNacimiento);
        String fechaStr=dateFormat.format(fechaNacimiento.getTime());
        //String.format("%-20s %-20s %-15s %-20s %-10 ","Nombre","Apellido","DNI","Fecha Nacimiento", "Sueldo");
        return String.format("%20s %20s %15s %20s %10.2f ",nombre,apellido,dni,fechaStr,sueldo);
    }

    //todo manejar hijos boolean Borrar hijos
    //todo manejar hijos boolean Anyadir hijo
    //todo manejar hijos boolean getEdad
    //todo manejar hijos getNombre
    //todo manejar hijos toString
}
