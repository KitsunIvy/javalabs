package ru.mirea.labs1920;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.preGenerate();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listSorted;


        for (int i = 0; i < n; i++) {
            list.add(generator.getRandom());
        }
        list.add("А000AА01");
        System.out.println(list);

        listSorted = list;
        Collections.sort(listSorted);
        HashSet hashSet = new HashSet(list);
        TreeSet treeSet = new TreeSet<>(list);

        System.out.println();

        long m = System.nanoTime();
        System.out.printf("Поиск перебором: номер %s, поиск занял %dнс",
                (list.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Бинарный поиск: номер %s, поиск занял %dнс",
                (Collections.binarySearch(listSorted, str) >= 0 ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %dнс",
                (hashSet.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Поиск в TreeSet: номер %s, поиск занял %dнс",
                (treeSet.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();
    }
}
