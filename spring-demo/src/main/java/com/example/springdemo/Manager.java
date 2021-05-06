package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Qualifier("impl1")
    IPrint iPrint;

    public Manager(IPrint iPrint) {
        this.iPrint = iPrint;
    }

    public String print(){
        return iPrint.printStartup();
    }

}
