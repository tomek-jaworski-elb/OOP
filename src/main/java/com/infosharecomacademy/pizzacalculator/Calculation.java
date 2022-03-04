package com.infosharecomacademy.pizzacalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculation {

    public void run(int count) {
        List<Pizza> pizzaList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Pizza nr. " + (i + 1));
            pizzaList.add(new Pizza(getRadius(), getPrice()));
        }
        int index = 0;
        double factor = 0;

        for (Pizza pizza : pizzaList) {
            if (factor == 0) {
                factor = pizza.getFactor();
            }
            if (pizza.getFactor() < factor) {
                factor = pizza.getFactor();
                index = pizzaList.indexOf(pizza);
            }
            System.out.println(pizza.getFactor());
        }
        System.out.println("Najbardziej opłacalna pizza to nr: " + (index + 1));
        System.out.println(pizzaList.get(index).toString());
    }

    private double getPrice() {
        System.out.print("Podaj cenę: ");
        return getInput();
    }

    private double getRadius() {
        System.out.print("Podaj średnicę: ");
        double in = getInput() * .5;
        if (in > 0) {
            return in;
        } else {
            throw new ArithmeticException("Dzielenie przez 0");
        }
    }

    private double getInput() {
        double result;
        boolean isFail = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                result = Double.parseDouble(scanner.nextLine());
                if (result <= 0) {
                    throw new ArithmeticException();
                }
                isFail = false;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                result = 0;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                result = 0;
            } catch (ArithmeticException e) {
                System.out.println("Liczba musi być > 0");
                result = 0;
            }
        } while (isFail);
        return result;
    }

    public int getPizzaNumber() {
        System.out.print("Podaj ilość pizza: ");
        return (int) getInput();
    }

}
