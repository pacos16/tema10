package com.pacosignes.ex3;

import java.util.ArrayList;


public class Ex3 implements IPila<String> {
    ArrayList<String> arrayList;

    public Ex3(){arrayList=new ArrayList<>();}
    @Override
    public String push(String e) {
        arrayList.add(e);
        return e;
    }

    @Override
    public String pop() {

        return  arrayList.remove(arrayList.size()-1);
    }


    @Override
    public String top() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
