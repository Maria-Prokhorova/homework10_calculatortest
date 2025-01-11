package com.example.homework_2.__calculator;

import com.example.homework_2.__calculator.service.CalculatorService;
import com.example.homework_2.__calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTests {

    public final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void calculatorPlusTestWhenCorrectArguments() {
        int a1 = 3;
        int b1 = 5;
        String expected1 = "3 + 5 = 8";
        String actual1 = calculatorService.plus(a1, b1);
        assertEquals(expected1, actual1);

        int a2 = 15;
        int b2 = 45;
        String expected2 = "15 + 45 = 60";
        String actual2 = calculatorService.plus(a2, b2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculatorPlusTestWhenIsNotCorrectArguments() {
        int a = 3;
        assertThrows(NullPointerException.class, () -> calculatorService.plus(a, null));

        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, a));

        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, null));
    }

    @Test
    public void calculatorMinusTestWhenCorrectArguments() {
        int a1 = 3;
        int b1 = 5;
        String expected1 = "3 - 5 = -2";
        String actual1 = calculatorService.minus(a1, b1);
        assertEquals(expected1, actual1);

        int a2 = 20;
        int b2 = 7;
        String expected2 = "20 - 7 = 13";
        String actual2 = calculatorService.minus(a2, b2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculatorMinusTestWhenIsNotCorrectArguments() {
        int a = 3;
        assertThrows(NullPointerException.class, () -> calculatorService.minus(a, null));

        assertThrows(NullPointerException.class, () -> calculatorService.minus(null, a));

        assertThrows(NullPointerException.class, () -> calculatorService.minus(null, null));
    }

    @Test
    public void calculatorMultiplyTestWhenCorrectArguments() {
        int a1 = 10;
        int b1 = 5;
        String expected1 = "10 * 5 = 50";
        String actual1 = calculatorService.multiply(a1, b1);
        assertEquals(expected1, actual1);

        int a2 = 7;
        int b2 = 7;
        String expected2 = "7 * 7 = 49";
        String actual2 = calculatorService.multiply(a2, b2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculatorMultiplyTestWhenIsNotCorrectArguments() {
        int a = 3;
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(a, null));

        assertThrows(NullPointerException.class, () -> calculatorService.multiply(null, a));

        assertThrows(NullPointerException.class, () -> calculatorService.multiply(null, null));
    }

    @Test
    public void calculatorDivideTestWhenCorrectArguments() {
        int a1 = 15;
        int b1 = 5;
        String expected1 = "15 / 5 = 3";
        String actual1 = calculatorService.divide(a1, b1);
        assertEquals(expected1, actual1);

        int a2 = 100;
        int b2 = 10;
        String expected2 = "100 / 10 = 10";
        String actual2 = calculatorService.divide(a2, b2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculatorDivideTestWhenIsNotCorrectArguments() {
        int a = 3;
        assertThrows(NullPointerException.class, () -> calculatorService.divide(a, null));

        assertThrows(NullPointerException.class, () -> calculatorService.divide(null, a));

        assertThrows(NullPointerException.class, () -> calculatorService.divide(null, null));
    }

    @Test
    public void calculatorDivideOnZeroTest() {
        int a = 3;
        int b = 0;
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(a, b));
    }
}