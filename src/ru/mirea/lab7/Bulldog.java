package ru.mirea.lab7;

import java.util.Objects;

public class Bulldog extends Dog {
    private String subBreed;

    public Bulldog(String subBreed) {
        super("Bulldog", 80, 20);
        this.subBreed = subBreed;
    }

    public String getSubBreed() {
        return subBreed;
    }

    public void setSubBreed(String subBreed) {
        this.subBreed = subBreed;
    }

    @Override
    public void feed() {
        if (Objects.equals(this.subBreed, "French")) {
            this.setHunger(this.getHunger() - 20);
            this.setHealth(this.getHealth() - 10);
        } else {
            this.setHunger(this.getHunger() - 10);
            this.setHealth(this.getHealth() - 7);
        }
    }

    @Override
    public void heal() {
        this.setHealth(this.getHealth() + 8);
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "subBreed='" + subBreed + '\'' +
                ", breed='" + breed + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                '}';
    }
}
