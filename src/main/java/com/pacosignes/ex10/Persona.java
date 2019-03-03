package com.pacosignes.ex10;



import java.text.SimpleDateFormat;

import java.util.GregorianCalendar;


public class Persona {
    public enum Sexo{F,M};

    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;
    protected GregorianCalendar fechaNacimiento;
    protected Sexo sexo;

    public Persona(String nombre, GregorianCalendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido1, String dni, GregorianCalendar fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido1, String apellido2,
                   String dni, GregorianCalendar fechaNacimiento, Sexo sexo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo(){
        if(sexo.equals(Sexo.F)){

            return "Femenino";

        }else{
            return "Masculino";
        }
    }

    public boolean compruebaSexo(char c){
        if (c=='M' || c=='m'){
            return sexo.equals(Sexo.M);
        }else if(c=='F'|| c=='f'){
            return sexo.equals(Sexo.F);
        }else{
            return false;
        }
    }


    public int getEdadAnyos(){
        GregorianCalendar now =new GregorianCalendar();
        long ms=(now.getTimeInMillis()-fechaNacimiento.getTimeInMillis());
        return (int)(((((ms/1000)/60)/60)/24)/365.25);

    }


    public String toString(){


        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr=dateFormat.format(fechaNacimiento.getTime());
        //String.format("%15s %15s %12s %12s %10s ","Nombre","Apellidos","DNI","Fecha Nacimiento");
        return String.format("%15s %20s %12s %12s",nombre,apellido1+apellido2,dni,fechaStr);


    }
}
