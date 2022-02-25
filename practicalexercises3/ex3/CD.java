package com.practicalexercises3.ex3;

public class CD {
    private String author;
    private String title;
    private int publicationYear;
    private double price;

    public CD(String author, String title, int publicationYear, double price) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                '}';
    }
}
