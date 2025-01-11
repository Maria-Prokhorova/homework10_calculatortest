package com.example.homework_2.__calculator;

import com.example.homework_2.__calculator.service.CalculatorService;
import com.example.homework_2.__calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTests {

    public final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCorrectParamsForTests")
    public void plusTestCorrectParam(int a, int b) {
        String expectedResult = a + " + " + b + " = " + (a + b);
        String actualResult = calculatorService.plus(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectParamsForTests")
    public void plusTestNotCorrectParam(Integer a, Integer b) {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideCorrectParamsForTests")
    public void minusTestCorrectParam(int a, int b) {
        String expectedResult = a + " - " + b + " = " + (a - b);
        String actualResult = calculatorService.minus(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectParamsForTests")
    public void minusTestNotCorrectParam(Integer a, Integer b) {
        assertThrows(NullPointerException.class, () -> calculatorService.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideCorrectParamsForTests")
    public void multiplyTestCorrectParam(int a, int b) {
        String expectedResult = a + " * " + b + " = " + (a * b);
        String actualResult = calculatorService.multiply(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectParamsForTests")
    public void multiplyTestNotCorrectParam(Integer a, Integer b) {
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideCorrectParamsForTests")
    public void divideTestCorrectParam(int a, int b) {
        String expectedResul = a + " / " + b + " = " + (a / b);
        String actualResult = calculatorService.divide(a, b);
        assertEquals(expectedResul, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectParamsForTests")
    public void divideTestNotCorrectParam(Integer a, Integer b) {
        assertThrows(NullPointerException.class, () -> calculatorService.divide(a, b));
    }


    public static Stream<Arguments> provideCorrectParamsForTests() {
        return Stream.of(
                Arguments.of(3, 5),
                Arguments.of(15, 15),
                Arguments.of(-10, 2),
                Arguments.of(0, 15),
                Arguments.of(17, 23)
        );

    }

    public static Stream<Arguments> provideNotCorrectParamsForTests() {
        return Stream.of(
                Arguments.of(13, null),
                Arguments.of(null, 25),
                Arguments.of(null, null)
        );

    }
}
