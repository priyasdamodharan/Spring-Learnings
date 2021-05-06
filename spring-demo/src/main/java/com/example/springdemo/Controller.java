package com.example.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    managerOne managerOne; //Field level Injection

    @GetMapping("/demo")
    public String demo(){
        return managerOne.print();
    }
}
