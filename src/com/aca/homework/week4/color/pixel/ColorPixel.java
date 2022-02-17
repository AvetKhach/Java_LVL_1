package com.aca.homework.week4.color.pixel;

public class ColorPixel extends Pixel{
    private String color;

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    @Override
    public double getY() {
        return super.getY();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
