package com.srimannr.generics;

class Sample<T>{
    private T value;
    public Sample(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}


public class Generics1 {
    static void main(String[] args) {
        System.out.println("Hello World!");
        Sample<Integer> s1 = new Sample<>(20);
    }
}
