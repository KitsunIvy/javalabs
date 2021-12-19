package ru.mirea.lab5;

public class CircleMovable extends Circle implements Movable {
    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        this.getCenter().setX(this.getCenter().getX() + x);
        this.getCenter().setY(this.getCenter().getY() + y);
    }
}
