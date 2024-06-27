package com.jimmysalazar.api.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRangeExample {
    public static void main(String[] args) {

        IntStream nums = IntStream.range(5, 20).
                            peek(System.out::println); // No es necesario especiicar el genérico

        // int resultadoNum = nums.reduce(0, Integer::sum); // (a,b)->a+b
        // int resultadoNum = nums.sum(); // solo disponible en enteros
        // System.out.println("resultadoNum = " + resultadoNum);

        // Permite tener estadísticas de números
        IntSummaryStatistics statistics = nums.summaryStatistics();
        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("avg: " + statistics.getAverage());
        System.out.println("total: " + statistics.getCount());
    }
}
