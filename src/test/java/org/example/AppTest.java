package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {



    @Test
    void getRecursiveSumOfDigitBaseCase() {
        int actualResult = App.getRecursiveSumOfDigit("1", 1);
        assertEquals(1, actualResult);
    }

    @Test
    void getRecursiveSumOfDigitInput2Case() {
        int actualResult = App.getRecursiveSumOfDigit("123", 2);
        assertEquals(3, actualResult);
    }

    @Test
    void getRecursiveSumOfDigitInput3Case() {
        int actualResult = App.getRecursiveSumOfDigit("2147223647", 2147223647);
        assertEquals(4, actualResult);
    }


    @Test
    void getRecursiveSumOfDigitAnotherCase() {
        int actualResult = App.getRecursiveSumOfDigit("9", 1);
        assertEquals(9, actualResult);
    }

    @Test
    void getRecursiveSumOfDigitAnotherCase2() {
        int actualResult = App.getRecursiveSumOfDigit("4569", 3);
        assertEquals(9, actualResult);
    }

}