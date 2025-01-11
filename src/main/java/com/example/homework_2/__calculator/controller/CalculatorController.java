package com.example.homework_2.__calculator.controller;

import com.example.homework_2.__calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping()
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        return service.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return service.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam int num1, @RequestParam int num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam int num1, @RequestParam int num2) {
        return service.divide(num1, num2);
    }

}
