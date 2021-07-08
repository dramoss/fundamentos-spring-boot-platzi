package com.fundamentos.platzi.springboot.fundamentos.configuration;

import com.fundamentos.platzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Impl();
    }
    @Bean
    public MyOperation myOperationOperation(){
        return new MyOperationImpl();
    }
    @Bean
    public MyBeanWithDependency myOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImpl(myOperation);
    }
}
