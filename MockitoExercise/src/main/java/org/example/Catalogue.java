package org.example;

import java.util.ArrayList;
import java.util.List;

public class Catalogue implements ReadItemCommand {
    // Arraylist is an implementation of the list interface
    private List<Book> books = new ArrayList<>();

    public Catalogue (ReadItemCommand readItemCommand) {
        this.books = readItemCommand.readAll();
    }

    List<Book> getAllBooks() {
        // call ReadItemCommand

        return this.books;
    }

    void addBook(Book bk) {
        this.books.add(bk);
    }

    void addBooks(List<Book> bks) {
        this.books.addAll(bks);
    }

    void getBook(String isbn){
        // TODO
    }

    void deleteBook(Book bk){
        // TODO
        this.books.remove(bk);
    }

    void deleteAllBooks(){
        // TODO
        this.books = new ArrayList<Book>();
    }


    @Override
    public List<Book> readAll() {
        return new ArrayList<Book>();
    }

    @Override
    public Book getItem(String id) {
        return null;
    }
}
