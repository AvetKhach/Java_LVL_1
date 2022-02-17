package com.aca.homework.week5.car;

public class Car {
    private String color;
    private double width;
    private double weight;
    private String brand;

    public Car(String brand, String color, double width, double weight) {
        this.brand = brand;
        this.color = color;
        this.width = width;
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {

        return width;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
