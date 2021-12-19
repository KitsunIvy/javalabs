package ru.mirea.lab2.task2;

public class Ball {
    private String color;
    private String type;

    public Ball(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}