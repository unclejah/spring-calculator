package ru.tt.springcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num, Integer num2) {
        if(num == null) return "Отсутсвует значение num";
        if(num2 == null) return "Отсутсвует значение num2";
        return "Сумма = "+(num+num2);
    }

    @Override
    public String minus(Integer num, Integer num2) {
        if(num == null) return "Отсутсвует значение num";
        if(num2 == null) return "Отсутсвует значение num2";
        return "Разность = "+ (num-num2);
    }

    @Override
    public String multiply(Integer num, Integer num2) {
        if(num == null) return "Отсутсвует значение num";
        if(num2 == null) return "Отсутсвует значение num2";
        return "Произведение = "+ (num*num2);
    }

    @Override
    public String divide(Integer num, Integer num2) {
        if(num == null) return "Отсутсвует значение num";
        if(num2 == null) return "Отсутсвует значение num2";
        if(num2 == 0) return "На 0 делить нельзя";
        return "Сумма = "+(num/num2);
    }

}
