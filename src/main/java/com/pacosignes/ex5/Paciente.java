package com.pacosignes.ex5;

import java.util.GregorianCalendar;

public class Paciente {
    private int id;
    private static int idStatic;
    private GregorianCalendar fecha;
    private char sexo;
    private double peso;
    private double altura;

    public Paciente(GregorianCalendar fecha, char sexo, double peso, double altura) {
        this.id = idStatic;
        this.fecha = fecha;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        idStatic++;
    }

    public int getId() {
        return id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


    public double getImc(){
        return peso/(peso*peso);
    }

    public long getEdad(){

        GregorianCalendar now =new GregorianCalendar();
        long ms=(now.getTimeInMillis()-fecha.getTimeInMillis());
        return (long)(((((ms/1000)/60)/60)/24)/365.25);
    }
}
