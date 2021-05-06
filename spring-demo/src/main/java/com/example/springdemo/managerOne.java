package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class managerOne {
    @Autowired
    @Qualifier("impl1") //displays Good Bye
    IPrint iPrint;

    public managerOne(){}

    public managerOne(IPrint iPrint) {
            this.iPrint = iPrint;

        }

    public void setiPrint(IPrint iPrint) {
        this.iPrint = iPrint;
    }

    public String print(){
        return iPrint.printStartup();
    }

}
