package com.javalearning.CheatSheetProject.model;

public class HelloWorld {
    private String value = "Hello World ! Ceci est une API en Work in progress et on est PEUT-ETRE sortis de l'auberge";

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
