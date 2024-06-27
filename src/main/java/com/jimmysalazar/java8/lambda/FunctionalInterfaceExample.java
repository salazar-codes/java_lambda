package com.jimmysalazar.java8.lambda;

import com.jimmysalazar.java8.lambda.arithmetic.Arithmetic;
import com.jimmysalazar.java8.lambda.arithmetic.Calculator;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Arithmetic suma = (a, b) -> a + b;
        Arithmetic resta = (a, b) -> a - b;

        Calculator calculator = new Calculator();

        System.out.println(calculator.compute(10, 5, suma));
        System.out.println(calculator.compute(10, 5, resta));
        System.out.println(calculator.compute(10, 5, (a,b) -> a * b));

        System.out.println(calculator.compute(10, 5, (a,b) -> a + b));
    }
}
