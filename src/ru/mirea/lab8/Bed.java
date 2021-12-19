package ru.mirea.lab8;

public class Bed extends Furniture {
    private int springs;

    public Bed(String color, int size, String material, int springs) {
        super(color, size, material, size*100);
        this.springs = springs;
    }

    public int getSprings() {
        return springs;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "springs=" + springs +
                ", color=" + color +
                ", size=" + size +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
