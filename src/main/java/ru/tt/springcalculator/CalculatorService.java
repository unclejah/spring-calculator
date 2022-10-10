package ru.tt.springcalculator;

public interface CalculatorService {
    String calculator();

    Integer plus(Integer num, Integer num2);

    Integer minus(Integer num, Integer num2);

    Integer multiply(Integer num, Integer num2);

    Double divide(Integer num, Integer num2);
}
