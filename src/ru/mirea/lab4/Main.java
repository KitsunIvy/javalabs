package ru.mirea.lab4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.getArea());
        System.out.println(circle);
        Rectangle rect = new Rectangle(5, 3);
        System.out.println(rect.getPerimeter());
        System.out.println(rect);
        Square square = new Square(6.45, "blue", true);
        System.out.println(square);
    }
}
