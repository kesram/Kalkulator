package com.example.calc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {
    public class Calculator {
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

        public void main(String[] args){
            Calculator calculator = new Calculator();
            System.out.println(calculator.add(calculator.a, calculator.b));
        }
    }
    @Test
    void contextLoads() {
    }

}
