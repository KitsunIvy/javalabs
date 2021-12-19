package ru.mirea.lab7;

public class Plate extends Dish {
    private String shape;

    public Plate(int depth, int size, String material, String shape) {
        super(depth, size, material, 100);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public void use() {
        this.setDurability(this.getDurability() - 10);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "depth=" + depth +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", durability=" + durability +
                ", shape='" + shape + '\'' +
                '}';
    }
}