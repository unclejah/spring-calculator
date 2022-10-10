package ru.tt.springcalculator;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = {"", "/calculator"})
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping(value = "")
    public String calculator() {
        return calculatorServiceImpl.calculator();
    }

    @GetMapping(value = {"/plus"})
    public String plus(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Сумма = " + calculatorServiceImpl.plus(num, num2);
    }

    @GetMapping(value = {"/minus"})
    public String minus(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Разность = " + calculatorServiceImpl.minus(num, num2);
    }

    @GetMapping(value = {"/multiply"})
    public String multiply(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";
        return "Произведение = " + calculatorServiceImpl.multiply(num, num2);
    }

    @GetMapping(value = {"/divide"})
    public String divide(@RequestParam(name = "num", required = false) Integer num, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num == null) return "Отсутсвует значение num";
        if (num2 == null) return "Отсутсвует значение num2";

        return "деление = " + calculatorServiceImpl.divide(num, num2);
    }
}
