package ru.mirea.lab2.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book {
    private String name, author;
    private int releaseYear;
    private ArrayList<String> tags;

    public Book(String name, String author, int releaseYear, String ...tags) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.tags = new ArrayList<>(Arrays.asList(tags));
        Collections.sort(this.tags);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTags(String ...tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        Collections.sort(this.tags);
    }

    public void appendTags(String ...tags) {
        Collections.addAll(this.tags, tags);
        Collections.sort(this.tags);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                ", tags=" + tags +
                '}';
    }
}
