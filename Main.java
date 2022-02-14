package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4);
        System.out.println(circle);
        circle = new Circle(3,"black",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3,5);
        System.out.println(rectangle);
        rectangle = new Rectangle(4,7,"yellow",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(4);
        System.out.println(square);
        square = new Square(6,"blue",true);
        System.out.println(square);

    }
}
