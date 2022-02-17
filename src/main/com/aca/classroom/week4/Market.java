package com.aca.classroom.week4;

public class Market {

    public static void main(String[] args) {
        Car car = carOption1();
        car.openDoor();
        Car car1 = carOption2();
        car1.openDoor();

    }

    public static Car carOption1() {
        Car car = new Car();
        car.setAudioPlayer(new AudioPlayer());
        return car;
    }


    public static Car carOption2() {
        Car car = new Car();
        return car;
    }

}
