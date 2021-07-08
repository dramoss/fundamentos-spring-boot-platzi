package com.fundamentos.platzi.springboot.fundamentos.bean;

public class MyBean2Impl implements MyBean{
    @Override
    public void print() {
        System.err.println("Hola desde my Impl 2 propia del bean 2");
    }
}
