package com.fundamentos.platzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements ComponentDependency{
    @Override
    public void saludar() {
        System.err.println("Hola Mundo desde componente");
    }
}
