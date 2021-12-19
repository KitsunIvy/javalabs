package ru.mirea.lab2.task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(
                "White Fang",
                "Jack London",
                1906,
                "adventure", "animals", "english"
        );
        book.appendTags("classics");
        System.out.println(book);
    }
}
