package com.jimmysalazar.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato","Paco","Pepa","Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);

        List<String> lista = nombres.collect(Collectors.toList()); // op. terminal

        //nombres.forEach(System.out::println);
        lista.forEach(System.out::println);
    }
}
