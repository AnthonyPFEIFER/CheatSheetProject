package com.javalearning.CheatSheetProject.service;

import com.javalearning.CheatSheetProject.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
