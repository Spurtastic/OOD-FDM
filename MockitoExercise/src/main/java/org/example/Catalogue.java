package org.example;

import java.util.ArrayList;
import java.util.List;

public class Catalogue implements ReadItemCommand {
    // Arraylist is an implementation of the list interface
    private ArrayList<Book> books = new ArrayList<Book>();
    private WriteItemCommand WIC;
    private ReadItemCommand RIC;

    public Catalogue () {
    }

    public void setWriteCommand(WriteItemCommand writeItemCommand) {
        this.WIC = writeItemCommand;
    }

    public void setReadCommand(ReadItemCommand readItemCommand) {
        this.RIC = readItemCommand;
    }

    ArrayList<Book> getAllBooks() {
        // call ReadItemCommand

        return this.books;
    }

    void addBook(Book bk) {
        this.WIC.insertItem(bk);
    }

    public ArrayList<Book> addBooks (ArrayList<Book> books) {
        for (Book book : books) {
            this.addBook(book);
        } return this.books;
    }

    Book getBook(String isbn){
        // TODO
        return this.RIC.getItem(isbn);
    }

    void deleteBook(Book bk){
        // TODO
        this.WIC.deleteItem(bk);
    }

    void deleteAllBooks(){
        // TODO
        ArrayList<Book> books = this.RIC.readAll();
        for (Book b : books) {
            this.deleteBook(b);
        }
    }


    @Override
    public ArrayList<Book> readAll() {
        return new ArrayList<Book>();
    }

    @Override
    public Book getItem(String id) {
        return null;
    }
}
