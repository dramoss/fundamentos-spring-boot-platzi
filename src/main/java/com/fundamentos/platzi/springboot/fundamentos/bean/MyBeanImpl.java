package com.fundamentos.platzi.springboot.fundamentos.bean;

public class MyBeanImpl implements MyBean{
    @Override
    public void print() {
        System.err.println("Hola desde my Impl propia del bean");
    }
}
