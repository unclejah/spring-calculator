package ru.tt.springcalculator;

public interface CalculatorService {
    String calculator();
    String plus(Integer num, Integer num2);
    String minus(Integer num, Integer num2);
    String multiply(Integer num, Integer num2);
    String divide(Integer num, Integer num2);
}
