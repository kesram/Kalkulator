package com.example.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(calculator.a, calculator.b));
    }

}

class Calculator {
    int a = 5;
    int b = 6;

    public int add(int a, int b){
        int i = a + b;
        return i;
    }
    public int subtract(int a, int b) {
        int i = a - b;
        return i;
    }
}