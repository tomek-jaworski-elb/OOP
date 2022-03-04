package com.infosharecomacademy.pizzacalculator;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        new Calculation().run(new Calculation().getPizzaNumber());
    }
}
