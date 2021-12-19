package ru.mirea.lab7;

public abstract class Dish {
    protected int depth, size, durability;
    protected String material;

    public Dish(int depth, int size, String material, int durability) {
        this.depth = depth;
        this.size = size;
        this.material = material;
        this.durability = durability;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Dish{" +
                "depth=" + depth +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", durability=" + durability +
                '}';
    }
}
