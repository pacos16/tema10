package com.pacosignes.ex3;

public interface IPila<T> {

    public T push(T e);
    public T pop();
    public T top();
    public int size();
    public boolean isEmpty();



}
