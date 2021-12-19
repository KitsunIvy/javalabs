package ru.mirea.lab3.task1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5, 2, 3);
        System.out.println(circle);
        circle.setY(3.14);
        System.out.println(circle);
    }
}
