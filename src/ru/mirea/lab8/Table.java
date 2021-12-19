package ru.mirea.lab8;

public class Table extends Furniture {
    private int height;

    public Table(String color, int size, String material, int height) {
        super(color, size, material, height*50);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color=" + color +
                ", size=" + size +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", height=" + height +
                '}';
    }
}
