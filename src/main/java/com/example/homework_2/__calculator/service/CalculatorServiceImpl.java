package com.example.homework_2.__calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1==null || num2==null)
            throw new NullPointerException("Аргументы не должны быть пустыми.");
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1==null || num2==null)
            throw new NullPointerException("Аргументы не должны быть пустыми.");
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1==null || num2==null)
            throw new NullPointerException("Аргументы не должны быть пустыми.");
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1==null || num2==null)
            throw new NullPointerException("Аргументы не должны быть пустыми.");
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
