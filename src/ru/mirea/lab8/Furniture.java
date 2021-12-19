package ru.mirea.lab8;

public abstract class Furniture {
    protected int size, price;
    protected String color, material;

    public Furniture(String color, int size, String material, int price) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
