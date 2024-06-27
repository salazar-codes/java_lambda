package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterAnyMatchExample {

    public static void main(String[] args) {
        boolean exists = Stream
                .of("Pato","Paco","Pepa","Pepe1","Pepe2","Al","Pepe3")
                .map(Usuario::new)
                .peek(System.out::println)
                .anyMatch(u -> u.getNombre().equals("Pepa")); // Returns boolean

        System.out.println("exists = " + exists);
    }
}
