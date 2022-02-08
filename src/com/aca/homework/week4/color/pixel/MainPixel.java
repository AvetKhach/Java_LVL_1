package com.aca.homework.week4.color.pixel;

public class MainPixel {
    public static void main(String[] args) {

        ColorPixel colorPixel1 = new ColorPixel();
        colorPixel1.setX(8.9);
        colorPixel1.setY(7.8);
        colorPixel1.setColor("red");

        ColorPixel colorPixel2 = new ColorPixel();
        colorPixel2.setX(1.2);
        colorPixel2.setY(2);
        colorPixel2.setColor("red");

        ColorPixel colorPixel3 = new ColorPixel();
        colorPixel3.setX(5);
        colorPixel3.setY(6.8);
        colorPixel3.setColor("blue");

        System.out.println("We have 3 pixels, pixel coordinates and color below, corresponding X, Y, 'color' ");
        System.out.println("First pixel : " + colorPixel1.getX() + ", " + colorPixel1.getY() + ", " + colorPixel1.getColor());
        System.out.println("Second pixel : " + colorPixel2.getX() + ", " + colorPixel2.getY() + ", " + colorPixel2.getColor());
        System.out.println("Third pixel : " + colorPixel3.getX() + ", " + colorPixel3.getY() + ", " + colorPixel3.getColor());


    }
}
