package com.infosharecomacademy.pizzacalculator;

public class Pizza {
    private double radius;
    private double price;
    private double factor;

    public Pizza(double radius, double price) {
        this.radius = radius;
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFactor() {
        this.factor = getPrice() / (Math.pow(getRadius(), 1) * Math.PI);
        return factor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "radius=" + radius +
                ", price=" + price +
                ", factor=" + factor +
                '}';
    }
}
