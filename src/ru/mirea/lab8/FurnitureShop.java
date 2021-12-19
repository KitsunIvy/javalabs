package ru.mirea.lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private ArrayList<Furniture> cart = new ArrayList(0);
    private int cash = 0;

    public int getCash() {
        return cash;
    }

    public ArrayList<Furniture> getCart() {
        return cart;
    }

    public void menu() {
        int answer = -1;

        while (answer != 0) {
            System.out.println();
            System.out.println("Выберите опцию: ");
            System.out.println("1) Добавить в корзину");
            System.out.println("2) Убрать из корзины");
            System.out.println("3) Подсчитать итоговую стоимость");
            System.out.println("0) Выход");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    addToCart();
                    break;
                case 2:
                    removeFromCart();
                    break;
                case 3:
                    System.out.println(this.getCash());
                    System.out.println();
                    break;
            }
        }
    }

    private void addToCart() {
        int size;
        String color, material;

        System.out.println();
        System.out.println("Выберите товар: ");
        System.out.println("1) Кровать");
        System.out.println("2) Стол");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        System.out.println();
        System.out.println("Введите цвет: ");
        scanner.nextLine();
        color = scanner.nextLine();

        System.out.println("Введите размер: ");
        size = scanner.nextInt();

        System.out.println("Введите материал: ");
        scanner.nextLine();
        material = scanner.nextLine();

        switch (answer) {
            case 1:
                System.out.println("Введите количество пружин: ");
                int springs = scanner.nextInt();
                cart.add(new Bed(color, size, material, springs));
                break;
            case 2:
                System.out.println("Введите высоту: ");
                int height = scanner.nextInt();
                cart.add(new Table(color, size, material, height));
                break;
        }
        cash += cart.get(cart.size() - 1).getPrice();
        System.out.println();
    }

    private void removeFromCart() {
        System.out.println();
        if (cart.size() != 0) {
            System.out.println("Выберите товар, который хотите удалить из корзины: ");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(i + 1 + ") " + cart.get(i));
            }

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt() - 1;
            cash -= cart.get(answer).getPrice();
            cart.remove(answer);
        } else {
            System.out.println("В корзине нет товаров!");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "cart=" + cart +
                ", cash=" + cash +
                '}';
    }
}
