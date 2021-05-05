package com.example.springdemo;

public class Manager {

    IPrint iPrint;

    public Manager(IPrint iPrint) {
        this.iPrint = iPrint;
    }

    public String print(){
        return iPrint.printStartup();
    }

}
