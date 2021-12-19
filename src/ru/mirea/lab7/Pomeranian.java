package ru.mirea.lab7;

public class Pomeranian extends Dog {
    private int furLength;

    public Pomeranian(int furLength) {
        super("Pomeranian", 80, 20);
        this.furLength = furLength;
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public void feed() {
        this.setHunger(this.getHunger() - 20);
        this.setHealth(this.getHealth() - 5);
    }

    @Override
    public void heal() {
        this.setHealth(this.getHealth() + 10);
    }

    public void groom(int cutLength) {
        this.setFurLength(Math.max(this.getFurLength() - cutLength, 0));
    }

    @Override
    public String toString() {
        return "Pomeranian{" +
                "breed='" + breed + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                ", furLength=" + furLength +
                '}';
    }
}
