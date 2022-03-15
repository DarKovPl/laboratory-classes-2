package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(circle.getRadius(), 7);
        System.out.println(cylinder.getVolume());


    }
}
