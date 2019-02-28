package com.pacosignes.ex4;

import java.util.ArrayList;

public class Cola<T> implements ICola {

    ArrayList<T> arrayList;

    public Cola(){
        arrayList=new ArrayList<T>();
    }
    @Override
    boolean add(T e) {
        return arrayList.add(e);
    }

    @Override
     public  T remove() {
        return arrayList.remove(0);
    }

    @Override
    int size() {
        return arrayList.size();
    }

    @Override
    public T peek() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
