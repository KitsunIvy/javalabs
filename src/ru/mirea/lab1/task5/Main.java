package ru.mirea.lab1.task5;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            DecimalFormat format = new DecimalFormat("0.00");
            System.out.println(format.format(1.0 / i));
        }
    }
}
