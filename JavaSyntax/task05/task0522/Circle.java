package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (double x) {
        this.x = x;
    }

    public Circle (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle () {
        this(5, 10, 15);
    }

    public Circle (Circle circle){

    }


    public static void main(String[] args) {

    }
}