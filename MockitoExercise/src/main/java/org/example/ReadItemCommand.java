package org.example;

import java.util.ArrayList;
import java.util.List;

public interface ReadItemCommand {

    ArrayList<Book> readAll();
    Book getItem(String id);
}
