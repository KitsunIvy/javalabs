package ru.mirea.lab6;

public class Main {
    public static void main(String[] args) {
        RectangleMovable rectangleMovable = new RectangleMovable(new Point(5, 6), new Point(10, 3));
        System.out.println(rectangleMovable);
        rectangleMovable.move(7, 2);
        System.out.println(rectangleMovable);
    }
}
