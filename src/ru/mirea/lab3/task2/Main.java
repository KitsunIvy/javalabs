package ru.mirea.lab3.task2;

public class Main {
    public static void main(String[] args) {
        Human pete = new Human("Peter", 25);
        Head head = new Head(30, "white", 100);
        pete.addHeads(head);
        Hand leftHand = new Hand(15, "yellow", 80);
        Hand rightHand = new Hand(16, "green", 100);
        pete.addHands(leftHand, rightHand);
        Leg leg = new Leg(80, "black", 30);
        pete.addLegs(leg, leg);
        pete.setAge(26);
        System.out.println(pete);
    }
}
