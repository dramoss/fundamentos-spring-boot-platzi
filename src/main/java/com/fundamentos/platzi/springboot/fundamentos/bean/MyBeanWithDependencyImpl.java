package com.fundamentos.platzi.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImpl implements  MyBeanWithDependency{

    private MyOperation myOperation;

    @Autowired
    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.err.println(myOperation.sum(1));
        System.err.println("Hola desde la impl con un bean con dependencia");
    }
}
