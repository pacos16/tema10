package com.pacosignes.ex10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex10 {
    public static void main(String[] args) {
        Empleado e=new Empleado("P","Signes","53626257-D",
                new GregorianCalendar(1992, Calendar.OCTOBER,05),30000);
        System.out.println(e.toString());
        System.out.println(e.getEdadAnyos());
        DataBase dB=new DataBase();
        dB.nuevoEmpleado(e);
        System.out.println(dB.buscarPorNif("53626257-D"));
        System.out.println(dB.buscarRangoEdad(30,20));
        dB.getEmpleado(0).anyadirHijo(
                new Hijo("Vicente", new GregorianCalendar(2002,8,5)));

        System.out.println(dB.getEmpleado(0).eliminarHijo("Vicente"));
    }


    public static boolean validar(char c, String s){
        for(int i =0;i<s.length();i++){

            if (c==s.charAt(i)){
                return true;
            }

        }
        return false;
    }

    /**
     * Recibe un string i lo valida para un rango de enteros
     * Devuelve -1 en caso de que el numero no sea del rango apropiado o -2 quando hay un numforex
     * @param numStr
     * @param max
     * @param min
     * @return
     */
    public static int validarNumero(String numStr, int max, int min){
        int num;
        try{
            num=Integer.parseInt(numStr);
        }catch (NumberFormatException nfe){
            return -2;
        }
        if(num <min || num >max){
            return -1;

        }
        return num;
    }

    public static boolean validar(String s, int max ,int min){

        if (s.length()<=max && s.length()>=min){
            return true;
        }
        return false;

    }

}
