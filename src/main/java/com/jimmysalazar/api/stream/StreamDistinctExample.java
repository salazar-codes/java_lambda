package com.jimmysalazar.api.stream;

import java.util.stream.Stream;

public class StreamDistinctExample {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Pato","Paco","Paco","Paco","Pepe2","Al","","Al2","")
                .distinct();


        nombres.forEach(System.out::println);
    }
}
