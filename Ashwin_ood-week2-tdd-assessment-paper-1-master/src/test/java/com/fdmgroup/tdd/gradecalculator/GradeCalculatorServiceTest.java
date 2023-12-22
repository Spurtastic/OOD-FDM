package com.fdmgroup.tdd.gradecalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;




public class GradeCalculatorServiceTest {

    GradeCalculatorServiceImplementation trn;

    @BeforeEach
    public void setUp() throws Exception {
        trn = new GradeCalculatorServiceImplementation();
    }

    @Test
    public void test_getClassification_ReturnsFail_WhenMarkIsLessThan50() {
        // Arrange
        trn.setMark(40);
        // Act
        String result = trn.getClassification(trn.getMark());
        // Assert
        assertEquals("fail", result);
    }

    @Test
    public void test_getClassification_ReturnsPass_WhenMarkIsBetween75And80() {
        // Arrange
        trn.setMark(76);
        // Act
        String result = trn.getClassification(trn.getMark());
        // Assert
        assertEquals("pass", result);
    }

    @Test
    public void test_getClassification_ReturnsMerit_WhenMarkIsBetween80And90() {
        // Arrange
        trn.setMark(85);
        // Act
        String result = trn.getClassification(trn.getMark());
        // Assert
        assertEquals("merit", result);
    }

    @Test
    public void test_getClassification_ReturnsDistinction_WhenMarkIsBetween90And100() {
        // Arrange
        trn.setMark(90);
        // Act
        String result = trn.getClassification(trn.getMark());
        // Assert
        assertEquals("distinction", result);
    }

}
