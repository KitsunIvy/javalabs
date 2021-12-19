package ru.mirea.lab7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(5, 15, "Plastic", "Square");
        plate.use();
        System.out.println(plate);

        Pan pan = new Pan(10, 20, "Steel", 15);
        System.out.println(pan);

        Pomeranian pomeranian = new Pomeranian(20);
        pomeranian.groom(5);
        System.out.println(pomeranian);

        Bulldog bulldog = new Bulldog("French");
        bulldog.feed();
        System.out.println(bulldog);
    }
}
