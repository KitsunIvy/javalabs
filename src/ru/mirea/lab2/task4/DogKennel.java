package ru.mirea.lab2.task4;

import java.util.ArrayList;
import java.util.Collections;

public class DogKennel {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void addDogs(Dog ...dogs) {
        Collections.addAll(this.dogs, dogs);
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
