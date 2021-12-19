package ru.mirea.lab7;

public class Pan extends Dish {
    private int length;

    public Pan(int depth, int size, String material, int handleLength) {
        super(depth, size, material, 100);
        this.length = size + handleLength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void use() {
        this.setDurability(this.getDurability() - 5);
    }

    @Override
    public String toString() {
        return "Pan{" +
                "depth=" + depth +
                ", size=" + size +
                ", durability=" + durability +
                ", material='" + material + '\'' +
                ", length=" + length +
                '}';
    }
}
