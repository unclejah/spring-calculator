package ru.tt.springcalculator;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @RequestMapping(value = {"", "/calculator"})
    public String calculator() {
        return calculatorServiceImpl.calculator();
    }

    @RequestMapping(value = {"/calculator/plus"})
    public String plus(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Сумма = " + calculatorServiceImpl.plus(num, num2);
    }

    @RequestMapping(value = {"/calculator/minus"})
    public String minuns(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Разность = " + calculatorServiceImpl.minus(num, num2);
    }

    @RequestMapping(value = {"/calculator/multiply"})
    public String multiply(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Произведение = " + calculatorServiceImpl.multiply(num, num2);
    }

    @RequestMapping(value = {"/calculator/divide"})
    public String divide(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        if (num2 == 0) return "На 0 делить нельзя";
        return "деление = " + calculatorServiceImpl.divide(num, num2);
    }
}
