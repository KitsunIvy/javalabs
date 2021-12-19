package ru.mirea.lab1.task6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        rand_math();
        System.out.println();
        rand_class();
    }

    public static void rand_math() {
        System.out.println("Math.random():");
        int array_size = (int)(Math.random() * 10 + 1); // от 1 до 10 включительно
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = (int)(Math.random() * 100 + 1); // от 1 до 100 включительно
        }
        System.out.println("Before sort: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    public static void rand_class() {
        System.out.println("Class Random:");
        Random random = new Random();
        int array_size = random.nextInt(10) + 1; // от 1 до 10 включительно
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = random.nextInt(100) + 1; // от 1 до 100 включительно
        }
        System.out.println("Before sort: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }
}
