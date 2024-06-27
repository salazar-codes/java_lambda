package com.jimmysalazar.api.stream;

import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Pato","Paco","Paco","Paco","Pepe2","Al","","Al2","")
                .distinct();

        String resultado = nombres.reduce("result concat: ", (a , b) -> a + " - " + b);
        System.out.println(resultado);

        Stream<Integer> nums = Stream.of(5,10,15,20);
        int resultadoNum = nums.reduce(0, Integer::sum); // (a,b)->a+b
        System.out.println("resultadoNum = " + resultadoNum);
    }
}
