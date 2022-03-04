package com.infosharecomacademy.pizzacalculator;

public class Pizza {
    private final double radius;
    private final double price;
    private final double factor;

    public Pizza(double radius, double price) {
        this.radius = radius;
        this.price = price;
        factor = getPrice() / (getRadius() * getRadius() * Math.PI);
    }

    public double getRadius() {
        return radius;
    }


    public double getPrice() {
        return price;
    }


    public double getFactor() {
        return factor;
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
