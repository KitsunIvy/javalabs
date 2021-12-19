package ru.mirea.lab3.task2;

public class Base {
    private int length, health;
    private String color;

    public Base(int length, String color, int health) {
        this.length = length;
        this.color = color;
        this.health = health;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", health=" + health +
                '}';
    }
}
