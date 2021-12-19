package ru.mirea.lab3.task3;

public class BookTest {
    public static void main(String[] args) {
        Book questionableBook = new Book(
                "Fifty Shades of Grey",
                "E. L. James",
                2011,
                7,
                "romance", "adult", "fiction", "erotica"
        );
        System.out.println(questionableBook);
    }
}
