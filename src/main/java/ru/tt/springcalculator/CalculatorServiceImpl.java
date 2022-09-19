package ru.tt.springcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plus(Integer num, Integer num2) {
        return num + num2;
    }

    @Override
    public Integer minus(Integer num, Integer num2) {
        return num - num2;
    }

    @Override
    public Integer multiply(Integer num, Integer num2) {
        return num * num2;
    }

    @Override
    public Double divide(Integer num, Integer num2) {
        return (double) num / (double) num2;
    }

}
