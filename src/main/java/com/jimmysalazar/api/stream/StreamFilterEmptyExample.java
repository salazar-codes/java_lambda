package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterEmptyExample {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Pato","Paco","Pepa","","Pepe2","Al","")
                .filter(String::isEmpty) // n -> n.isEmpty()
                .peek(System.out::println);

        long count = nombres.count();
        System.out.println("count = " + count);
    }
}
