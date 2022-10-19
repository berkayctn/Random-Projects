package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationsTest {

    @Test
    void summationTest() {
        var operations = new Operations();
        Assertions.assertEquals(operations.summation(2, 3), 5);
        Assertions.assertEquals(operations.summation(-2, 3), 1);
    }

    @Test
    void subtractionTest() {
        var operations = new Operations();
        Assertions.assertEquals(operations.subtraction(2, 1), 1);
        Assertions.assertEquals(operations.subtraction(-2, -2), 0);
        Assertions.assertEquals(operations.subtraction(2, 3), -1);
    }

    @Test
    void multiplicationTest() {
        var operations = new Operations();
        Assertions.assertEquals(operations.multiplication(2, 3), 6);
        Assertions.assertNotEquals(operations.multiplication(2, 7), 4);
    }

    @Test
    void divisionTest() {
        var operations = new Operations();
        Assertions.assertNotEquals(operations.division(2, 5), 3);
        Assertions.assertEquals(operations.division(5, 2), 2.5);
    }
}