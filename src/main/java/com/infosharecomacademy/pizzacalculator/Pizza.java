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
        this.factor = getPrice() / (getRadius() * getRadius() * Math.PI);
        return factor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "radius=" + radius / 1 +
                ", price=" + price +
                ", factor=" + factor +
                '}';
    }
}
