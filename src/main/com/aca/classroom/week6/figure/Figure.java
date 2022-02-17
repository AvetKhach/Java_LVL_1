package com.aca.classroom.week6.figure;

public class Figure {

    private FigureType type;

    private double width;
    private double height;
    private double radius;


    public Figure(double radius){
        type = FigureType.CIRCLE;
        this.radius = radius;
    }


    public Figure(double width, double height){
        type = FigureType.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    public double perimeter(){
        if (type == FigureType.RECTANGLE){
            return 2*Math.PI;
        }else {
            return (2*width)+(2*height);
        }

    }

    public double area(){
        if (type == FigureType.CIRCLE){
            return width*height;
        } else
      return width*height;
    }

    public static void main(String[] args) {

    }

    public static Figure ofRectangle(double width, double height){
        return new Figure(width,height);
    }
    public static Figure ofCircle(double radius){
        return new Figure(radius);
    }

    public FigureType getType() {
        return this.type;
    }
}
