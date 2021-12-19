package ru.mirea.lab5;

public class Main {
    public static void main(String[] args) {
        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);

        CircleMovable circleMovable = new CircleMovable(new Point(4, -2), 5f);
        System.out.println(circleMovable);
        circleMovable.move(15, 12);
        System.out.println(circleMovable);
    }
}
