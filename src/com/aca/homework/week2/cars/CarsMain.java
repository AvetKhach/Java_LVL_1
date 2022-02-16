package com.aca.homework.week2.cars;

public class CarsMain {

    public static void main(String[] args) {
        Car[] cars = creationPorscheCars();
        Car[] PorscheCars = filterCarsAfter2010Array(cars);
        printCars(PorscheCars);
    }

    public static Car[] creationPorscheCars() {
        Car[] cars = new Car[41];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].brand = "Porsche";
            cars[i].year = i + 1980;
        }
        return cars;
    }

    public static Car[] filterCarsAfter2010Array(Car[] cars) {
        Car[] filteredCars = new Car[cars.length];
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            filteredCars[i]= new Car();
            if (cars[i].year >= 2010) {
                filteredCars[i].year = cars[i].year;
                filteredCars[i].brand = cars[i].brand;
                count++;
            }else{
                filteredCars[i].year=0;
            }
        }
        Car[] filteredCarsWithCorrectSize = new Car[count];
        int j= 0;
        for (int i = 0; i < filteredCars.length; i++) {
            if (filteredCars[i].year != 0) {
                filteredCarsWithCorrectSize[j] = new Car();
                filteredCarsWithCorrectSize[j].year = filteredCars[i].year;
                filteredCarsWithCorrectSize[j].brand = filteredCars[i].brand;
                j++;
            }
        }
        return filteredCarsWithCorrectSize;
    }

    public static void printCars(Car[] PorscheCars) {
        for (int i = 0; i < PorscheCars.length; i++) {
            System.out.println(PorscheCars[i].brand+" "+PorscheCars[i].year );
        }
    }
}
