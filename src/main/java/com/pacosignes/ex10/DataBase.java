package com.pacosignes.ex10;

import java.util.ArrayList;


public class DataBase {
    private ArrayList<Empleado> empleados;

    public DataBase() {
        empleados=new ArrayList<>(100);
    }

    public boolean nuevoEmpleado(Empleado e){
        return empleados.add(e);
    }

    //todo buscarpornif
    public String buscarPorNif(String nif){


        for(int i=0; i<empleados.size();i++){
            if (nif.equals(empleados.get(i).getDni())){
                return empleados.get(i).toString();
            }
        }
        return "err 404";
    }
    //todo rangoedad
    public String buscarRangoEdad(int max, int min){
        boolean encontrado=false;
        StringBuilder string=new StringBuilder();
        string.append(
                String.format("%-15s %-15s %-12s %-16s %-12s \n","Nombre","Apellido","DNI","Fecha Nacimiento", "Sueldo"));

        for(int i=0;i<empleados.size();i++){
            if (empleados.get(i).getEdadAnyos()<=max && empleados.get(i).getEdadAnyos()>=min ){
                string.append(empleados.get(i).toString());
                encontrado=true;
            }
        }
        if (encontrado){
            return string.toString();
        }else{
            return"err 404";
        }

    }

    public Empleado getEmpleado(int posicion){
        return empleados.get(posicion);
    }
    public int getPosEmpleado(String nif){

        for(int i=0; i<empleados.size();i++){
            if (nif.equals(empleados.get(i).getDni())){
                return i;
            }
        }
        return -1;

    }

    //todo Rangosueldo


    //todo hijos menores


}
