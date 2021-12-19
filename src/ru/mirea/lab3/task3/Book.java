package ru.mirea.lab3.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book {
    private String name, author;
    private int releaseYear, rating;
    private ArrayList<String> tags;

    public Book(String name, String author, int releaseYear, int rating, String ...tags) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.tags = new ArrayList<>(Arrays.asList(tags));
        Collections.sort(this.tags);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getTags() {
        return tags;
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
                ", rating=" + rating +
                ", tags=" + tags +
                '}';
    }
}
