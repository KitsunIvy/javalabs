package ru.mirea.lab3.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Human {
    private String name;
    private int age;
    private ArrayList<Head> heads = new ArrayList<>();
    private ArrayList<Hand> hands = new ArrayList<>();
    private ArrayList<Leg> legs = new ArrayList<>();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addHeads(Head ...heads) {
        Collections.addAll(this.heads, heads);
    }

    public void addHands(Hand ...hands) {
        Collections.addAll(this.hands, hands);
    }

    public void addLegs(Leg ...legs) {
        Collections.addAll(this.legs, legs);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heads=" + heads +
                ", hands=" + hands +
                ", legs=" + legs +
                '}';
    }
}
