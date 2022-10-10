package ru.tt.springcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTes {

    @Test
    public void plus(){
        int num1 = 4;
        int num2 = 2;
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer expected = calculatorService.plus(num1, num2);
        Integer res = 4+2;
        assertEquals(expected, res);
    }
    @Test
    public void minus(){
        int num1 = 4;
        int num2 = 2;
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer expected = calculatorService.minus(num1, num2);
        Integer res = 4-2;
        assertEquals(expected, res);
    }
    @Test
    public void multiply(){
        int num1 = 4;
        int num2 = 2;
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer expected = calculatorService.multiply(num1, num2);
        Integer res = 4*2;
        assertEquals(expected, res);
    }
    @Test
    public void divide(){
        int num1 = 4;
        int num2 = 2;
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Double expected = calculatorService.divide(num1, num2);
        Double res = Double.valueOf(4 / 2);
        assertEquals(expected, res);
    }
    @Test
    public void divideZero(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        ErrorZero thrown = assertThrows(ErrorZero.class, () -> {
            calculatorService.divide(1, 0);
                }, "ErrorZero error was expected");

        assertEquals("На 0 делить нельзя", thrown.getMessage());
    }
}
