package ru.mirea.lab7;

public abstract class Dog {
    protected String breed;
    protected int health, hunger;

    public Dog(String breed, int health, int hunger) {
        this.breed = breed;
        this.health = health;
        this.hunger = hunger;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public abstract void feed();
    public abstract void heal();

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                '}';
    }
}