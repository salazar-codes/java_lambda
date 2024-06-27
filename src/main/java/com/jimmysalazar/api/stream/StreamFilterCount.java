package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.stream.Stream;

public class StreamFilterCount {
    public static void main(String[] args) {
        long count = Stream
                .of("Pato","Paco","Pepa","Pepe1","Pepe2","Al","Pepe3")
                .map(Usuario::new)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);
    }
}
