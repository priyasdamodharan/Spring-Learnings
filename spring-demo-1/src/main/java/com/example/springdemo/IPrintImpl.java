package com.example.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;

public class IPrintImpl implements IPrint {
    @Override
    public String printStartup() {
        return "Hello World";
    }
}
