package com.fundamentos.platzi.springboot.fundamentos.configuration;

import com.fundamentos.platzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.platzi.springboot.fundamentos.bean.MyBeanWithPropertiesImpl;
import com.fundamentos.platzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.apellido}")
    private String apellido;
    @Value("${value.name}")
    private String name;
    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties funcion(){
        return new MyBeanWithPropertiesImpl(name,apellido);
    }

}
