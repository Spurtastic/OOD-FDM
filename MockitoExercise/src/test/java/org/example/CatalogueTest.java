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

    Catalogue catalogue;
    @BeforeEach
    void setUp() throws Exception {
        catalogue = new Catalogue(mockReadItemCommand);
    }


    @Mock
    ReadItemCommand mockReadItemCommand;
    // Arrange

    @Test
    // test getAllBooks() stores the returned book list
    void test_getAllBooks_stores(){
        // Arrange
        Catalogue catalogue = new Catalogue(mockReadItemCommand);

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
        when(mockReadItemCommand.readAll()).thenReturn(catalogue.getAllBooks());
//        catalogue.addBook(new Book("1"));
//        catalogue.addBook(new Book("2"));
//        assertTrue(catalogue.getAllBooks().equals(mockReadItemCommand.readAll()));
        assertEquals(catalogue.getAllBooks(), mockReadItemCommand.readAll());
    }




}
