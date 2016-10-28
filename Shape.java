package com.company;

/**
 * Created by Administrator on 2016/10/28.
 */
public abstract class Shape {
    public abstract double getArea();

}
class Square extends Shape {
    private double height = 0;
    public Square(double height) {
        this.height = height;
    }
    public double getArea() {
        return (this.height * this.height);
    }
}
class Circle extends Shape {
    private double r = 0;
    private final static double PI = 3.14;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return (PI * r * r);
    }
}
class Triangle extends Shape {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double h = 0;
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        if (h == 0) {
            double s = (a+b+c)/2;
            return Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
        } else {
            return ( a * h / 2);
        }
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape  square = new Square(9) ;
        Shape  circle = new Circle(9) ;
        Shape  triangle1 = new Triangle(3, 4, 5);
        Shape  triangle2 = new Triangle(3, 4);

        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());

    }
}