package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book crime = new Book("Crime and punishment", 600);
        Book godfather = new Book("Godfather", 1000);
        Book monteCristo = new Book("Count of Monte Cristo", 1000);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = crime;
        books[2] = godfather;
        books[3] = monteCristo;
        for (int i = 0; i < books.length; i++) {
            System.out.printf("Book %d: %s, pages: %d%n", i + 1, books[i].name, books[i].pages);
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.printf("Book %d: %s, pages: %d%n", i + 1, books[i].name, books[i].pages);
        }
        for (Book book : books) {
            if (book.name.equals("Clean code")) {
                System.out.printf("%s, pages: %d%n", book.name, book.pages);
            }
        }
    }
}
