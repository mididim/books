package lv.sda.books;

import java.time.LocalDate;

public class Book {

    private String isbn;
    private String title;
    private String description;
    private String author;
    private String publisher;
    private int pages;
    private LocalDate publishingYear;

    //constructor - full

    public Book(){};

    public Book(String isbn, String title, String description,
                String author, String publisher, int pages,
                LocalDate publishingYear) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.publishingYear = publishingYear;
    }

    // get set

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Book setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Book setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public Book setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", publishingYear=" + publishingYear +
                '}';
    }

    public String toCSV() {
        return  isbn + ";" +
                title + ";" +
                description + ";" +
                author + ";" +
                publisher + ";" +
                pages + ";" +
                publishingYear.getYear() + "\n";
    }

}
