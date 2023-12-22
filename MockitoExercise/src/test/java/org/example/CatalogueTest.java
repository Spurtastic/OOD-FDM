package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CatalogueTest {

    @Mock
    ReadItemCommand mockReadItemCommand;

    @Mock
    WriteItemCommand mockWriteItemCommand;
    // Arrange

    @Mock
    Book mockBook, mockBook2;

    Catalogue catalogue;

    @BeforeEach
    void setUp() throws Exception {
        catalogue = new Catalogue();
        catalogue.setWriteCommand(mockWriteItemCommand);
        catalogue.setReadCommand(mockReadItemCommand);
    }



    @Test
    // test getAllBooks() stores the returned book list
    void test_getAllBooks_stores(){
        // Arrange
        Catalogue catalogue = new Catalogue();

        // Act - no act since the list is sposed to be empty
        // Assert
        assertEquals(0, catalogue.getAllBooks().size());
    }

    @Test
    // make a call to the readALl method of the ReadItemCommand
    void getAllBooks_CallsReadAllMethodofReadItemCommand_WhenCalled(){
        /**
         * Essentially for this we are injecting the mock object to pass to the class
         * Verify basically is used to ensure the number of calls a certain command is
         * called
         */
        // Act
        catalogue.getAllBooks();

        // Assert
        verify(mockReadItemCommand).readAll();
    }

    @Test
    void getAllBooks_ReturnsListOfBooksItRecievesFromReadAllMethodOfReadItemCommand_WhenCalled(){
        // safer to check if the lists are the same rather than size
        // Arrange
        when(mockReadItemCommand.readAll()).thenReturn(catalogue.getAllBooks());
        catalogue.addBook(new Book("1"));
        catalogue.addBook(new Book("2"));
        assertTrue(catalogue.getAllBooks().equals(mockReadItemCommand.readAll()));
        assertEquals(catalogue.getAllBooks(), mockReadItemCommand.readAll());
    }

    @Test
    void addBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
        // Act
        catalogue.addBook(mockBook);

        // Assert
        verify(mockWriteItemCommand).insertItem(mockBook);
    }

    @Test
    void addBookforTwoBooks_callsWriteItemCommandsMEthodWriteItemTwoTimes(){
        //Arrange
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(mockBook);
        books.add(mockBook2);
        //Act
        catalogue.addBooks(books);
        //Assert -
//        verify(mockWriteItemCommand, times(2)).insertItem(any(Book.class));
        for (Book book : books) {
            verify(mockWriteItemCommand).insertItem(book);
        }
    }

    @Test
    void getBookMethodReturnsABookWithSameISBNAsPassed(){
        //Arrange
        when(mockReadItemCommand.getItem("1")).thenReturn(mockBook);
        Book testValue = catalogue.getBook("1");
        assertEquals(testValue, mockBook);
    }

//    @Test
//    void catalogDeteletAllBooksCallsDeleteAllBooksMethodOfCatalogue_WhenCalled(){
//        //Act
//        catalogue.deleteAllBooks();
//        //Assert
//        verify(mockWriteItemCommand).deleteAllItems();
//    }

    @Test
    void deleteAllBooks_callsReadItemCommand_ReadAllMethod_thenCallsWriteItemCommandDeleteItemforEveryBookInList(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(mockBook);
        books.add(mockBook2);
        when(mockReadItemCommand.readAll()).thenReturn(books);
        catalogue.addBooks(books);
        catalogue.deleteAllBooks();
        for(Book b :books){
            verify(mockWriteItemCommand).deleteItem(b);
        }

    }



}
