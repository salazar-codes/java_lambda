package com.jimmysalazar.java8.lambda.arithmetic;

@FunctionalInterface // Esto solo agrega semántica más no funcionalidad
public interface Arithmetic {
    double operacion(double a, double b);
}
