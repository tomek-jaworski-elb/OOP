package com.infosharecomacademy.pizzacalculator;

public class Pizza {
    private final double radius;
    private final double price;
    private double factor;

    public Pizza(double radius, double price) {
        this.radius = radius;
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }


    public double getPrice() {
        return price;
    }


    public double getFactor() {
        return factor = getPrice() / (getRadius() * getRadius() * Math.PI);
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "średnica=" + radius * 2 +
                ", cena=" + price +
                ", factor=" + factor +
                '}';
    }
}
