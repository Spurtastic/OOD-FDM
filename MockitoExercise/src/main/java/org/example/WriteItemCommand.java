package org.example;

public interface WriteItemCommand {

    void insertItem(Book bk);
    void deleteItem(Book bk);
}
