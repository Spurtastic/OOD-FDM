package com.fdmgroup.tdd.groupcontroller;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GroupControllerServiceTest {

    @Mock
    DatabaseReader mockDatabaseReader;

    @Mock
    DatabaseWriter mockDatabaseWriter;

    @Mock
    Trainee mockTrainee, mockTrainee2, mockTrainee3;

    @Mock
    GroupControllerService mockGroupControllerService;

    ClassOfTrainees classOfTrainees;

    @BeforeEach
    public void setUp() throws Exception {
        mockTrainee = new Trainee("1");
        mockTrainee2 = new Trainee("2");
        mockTrainee3 = new Trainee("3");
        classOfTrainees = new ClassOfTrainees();
        classOfTrainees.setGroupControllerService(mockGroupControllerService);
        classOfTrainees.setDatabaseReader(mockDatabaseReader);
        classOfTrainees.setDatabaseWriter(mockDatabaseWriter);

    }

    @Test
    public void test_getAllTrainees_ReturnsMap_WhenCalled(){
        // Arrange
        Map<String, Trainee> expectedTraineeMap = new HashMap<String, Trainee>();
        expectedTraineeMap.put("1", mockTrainee);
        expectedTraineeMap.put("2", mockTrainee2);
        expectedTraineeMap.put("3", mockTrainee3);
        // Act
        when(mockGroupControllerService.getAllTrainees()).thenReturn(expectedTraineeMap);
        Map<String, Trainee> actualTraineeMap = mockGroupControllerService.getAllTrainees();

        // Assert
        assertEquals(expectedTraineeMap, actualTraineeMap);
    }

//    The removeTraineeByUsername() method should pass the trainee to be removed to the deleteTraineeByUsername()
//    method of the DatabaseWriter class (you should use the class provided and do not need to implement the database writer’s methods).
    @Test
    public void test_RemoveTraineeByUsernameBydeleteTraineeByUsernameOftheDatabaseWriter(){
        // Arrange
        classOfTrainees.addTrainee(mockTrainee);

        classOfTrainees.removeTraineeByUserName("1");
        // Act
        verify(mockDatabaseWriter).deleteTraineeByUsername("1");

    }

    @Test
    public void test_addTraineeByaddTraineeOftheDatabaseWriter(){
        // Arrange
        classOfTrainees.addTrainee(mockTrainee);
        // Act
        verify(mockDatabaseWriter).addTrainee(mockTrainee);

    }







}
