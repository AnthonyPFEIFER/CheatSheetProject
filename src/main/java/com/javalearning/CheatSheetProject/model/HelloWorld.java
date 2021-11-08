package com.javalearning.CheatSheetProject.model;

public class HelloWorld {
    private String value = "Hello World !";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
