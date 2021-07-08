package com.fundamentos.platzi.springboot.fundamentos;

import com.fundamentos.platzi.springboot.fundamentos.bean.MyBean;
import com.fundamentos.platzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.platzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.platzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.platzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
    private MyBean myBean;
    private MyBeanWithDependency myBeanWithDependency;
    private MyBeanWithProperties myBeanWithProperties;
    private UserPojo userPojo;

    @Autowired
    public FundamentosApplication(@Qualifier("componentTwoImpl") ComponentDependency componentDependency,
                                  MyBean myBean, MyBeanWithDependency myBeanWithDependency,
                                  MyBeanWithProperties myBeanWithProperties,
    UserPojo userPojo) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
        this.myBeanWithProperties = myBeanWithProperties;
        this.userPojo = userPojo;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.print();
        myBeanWithDependency.printWithDependency();
        System.err.println(myBeanWithProperties.function());
        System.err.println(userPojo.getEmail() + "-" + userPojo.getPassword() + "-" + userPojo.getEdad());
    }
}
