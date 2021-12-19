package ru.mirea.labs1920;

public class Randomizer {
    public static int rand(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
