package ru.mirea.lab2.task4;

public class Main {
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel();
        Dog pomeranian = new Dog("Kira", 5);
        Dog frenchBulldog = new Dog("Alex", 4);
        System.out.println(pomeranian.toHumanYears());
        dogKennel.addDogs(pomeranian, frenchBulldog);
        System.out.println(dogKennel);
    }
}
