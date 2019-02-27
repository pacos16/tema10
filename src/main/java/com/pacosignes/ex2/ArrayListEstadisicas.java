package com.pacosignes.ex2;


import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListEstadisicas implements IEstadisticas{

    private ArrayList<Double> arrayList=new ArrayList<>();

    @Override
    public double minimo() {
        return 0;
    }

    @Override
    public double maximo() {
        return 0;
    }

    @Override
    public double sumatorio() {
        return 0;
    }

    @Override
    public double media() {
        return 0;
    }

    @Override
    public double moda() {
        int valor;
        int min=Integer.MAX_VALUE;
        HashMap<Double,Integer> hashMap=new HashMap();
        for (double d: arrayList) {
            try {
                valor = hashMap.get(d);

                hashMap.replace(d,valor+1);

            }catch(NullPointerException npe){
                hashMap.put(d,1);

            }
            
        }

        return 0;
    }
}
