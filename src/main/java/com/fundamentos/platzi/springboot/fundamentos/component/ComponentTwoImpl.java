package com.fundamentos.platzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImpl implements ComponentDependency{
    @Override
    public void saludar() {
        System.err.println("Hola Mundo desde Componente 2");
    }
}
