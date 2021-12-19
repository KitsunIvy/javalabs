package ru.mirea.lab6;

public class RectangleMovable extends Rectangle implements Movable {
    public RectangleMovable(Point upperLeft, Point bottomRight) {
        super(upperLeft, bottomRight);
    }

    @Override
    public void move(int x, int y) {
        this.getUpperLeft().setX(this.getUpperLeft().getX() + x);
        this.getUpperLeft().setY(this.getUpperLeft().getY() + y);
        this.getBottomRight().setX(this.getBottomRight().getX() + x);
        this.getBottomRight().setY(this.getBottomRight().getY() + y);
    }
}
