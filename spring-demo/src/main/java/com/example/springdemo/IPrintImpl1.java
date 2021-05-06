package com.example.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("impl2")
public class IPrintImpl1 implements IPrint {
    @Override
    public String printStartup() {
        return "GoodBye World";
    }
}
