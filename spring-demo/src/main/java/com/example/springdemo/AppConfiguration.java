package com.example.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    /*
        @Bean
        Manager manager(){
            Manager manager =  new Manager(iPrint()); //Constructor Based Dependency Injection
            return manager;
    }*/

    @Autowired
    IPrint iPrint;
           @Bean
           managerOne manager(){
              managerOne managerOne =  new managerOne();
                managerOne.setiPrint(iPrint); //Setter Based Dependency Injection
                return managerOne;
            }

    //  @Bean
    // IPrint iPrint(){
    //     return new IPrintImpl();
    // }

}
