package com.infosharecomacademy.pizzacalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculation {

    public static void run(int count) {
        List<Pizza> pizzaList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Pizza nr. " + (i + 1));
            pizzaList.add(new Pizza(getRadius(), getPrice()));
        }
        int index = 0;
        double factor = 0;

        for (Pizza pizza : pizzaList) {
            if (pizza.getFactor() > factor) {
                factor = pizza.getFactor();
                index = pizzaList.indexOf(pizza);
            }
            System.out.println(pizza.getFactor());
        }
        System.out.println(pizzaList.get(index).toString());
    }

    private static double getPrice() {
        System.out.print("Podaj cenę: ");
        return getInput();
    }

    private static double getRadius() {
        System.out.print("Podaj średnicę: ");
        return getInput() * .5;
    }

    private static double getInput() {
        double result;
        boolean isFail = true ;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                result = Double.parseDouble(scanner.nextLine());
                isFail = false;
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
                result = 0;

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
                result = 0;
            }
        } while (isFail);
        return result;
    }

    public static int getPizzaNumber() {
        System.out.print("Podaj ilość pizza: ");
        return (int) getInput();
    }

}
