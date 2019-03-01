package com.pacosignes.ex5;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex5 {
    public static void main(String[] args) {
        Paciente p = new Paciente(new GregorianCalendar(1990, Calendar.MARCH,7),'h',60,1.75);
        System.out.println(p.getEdad());
        System.out.println(p.getId());
        Paciente p1 = new Paciente(new GregorianCalendar(1990, Calendar.MARCH,7),'h',60,1.75);
        System.out.println(p1.getId());

    }

}
