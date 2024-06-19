package com.jimmysalazar.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato","Paco","Pepa","Pepe");
        // nombres.forEach(System.out::println); // recibe un consumer, no retorna valor

        // A partir de un arreglo
        String[] arr = {"Pato","Paco","Pepa","Pepe"};
        nombres = Arrays.stream(arr);
        // nombres.forEach(System.out::println);

        // Utilizando StreamBuilder
        nombres = Stream.<String>builder()
                            .add("Pato")
                            .add("Pepe")
                            .build();
        // nombres.forEach(System.out::println);

        // A partir de un collection
        List<String> lista = new ArrayList<>();
        lista.add("Paco");
        lista.add("Pato");
        lista.add("Pepe");

        nombres = lista.stream();
        nombres.forEach(System.out::println);
    }
}
