package com.example.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("impl1")
public class IPrintImpl implements IPrint {
    @Override
    public String printStartup() {
        return "Hello World";
    }
}
