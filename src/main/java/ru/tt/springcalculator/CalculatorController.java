package ru.tt.springcalculator;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl){
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @RequestMapping(value = {"", "/calculator","/calculator/plus","/calculator/minus","/calculator/multiply","/calculator/divide"})
    public String calculator(HttpServletRequest request,
                             @RequestParam(name = "num",required = false) Integer num, @RequestParam(name = "num2",required = false) Integer num2){

        String s = request.getRequestURI().substring(11);
        switch (s){
            case "/plus":
                return calculatorServiceImpl.plus(num,num2);
            case "/minus":
                return calculatorServiceImpl.minus(num,num2);
            case "/multiply":
                return calculatorServiceImpl.multiply(num, num2);
            case "/divide":
                return calculatorServiceImpl.divide(num, num2);
            default:return calculatorServiceImpl.calculator();
        }
    }
}
