package com.infosharecomacademy.pizzacalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Calculation {

    public static void run(int count) {
        List<Pizza> pizzaList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Pizza nr. " + i);
            pizzaList.add(new Pizza(getRadius(),getPrice()));
        }
        int index = 0;
        double factor = 0;

        for (Pizza pizza : pizzaList) {
            if(pizza.getFactor()> factor) {
               factor = pizza.getFactor();
               index = pizzaList.indexOf(pizza);
            }
            System.out.println(pizza.getFactor());
        }
        System.out.println(pizzaList.get(index).toString());

    }

    private static int getPrice() {
        System.out.print("Podaj cenę: ");
        int getInput = getInput();
        return getInput;
    }

    private static double getRadius() {
        System.out.print("Podaj średnicę: ");
        int getInput = getInput();
        return getInput / 2d;
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double getFactor() {
        return getPrice() / (Math.pow(getRadius(), 1) * Math.PI);
    }
}
