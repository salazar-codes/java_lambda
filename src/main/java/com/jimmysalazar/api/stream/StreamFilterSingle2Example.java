package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterSingle2Example {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Pato","Paco","Pepa","Pepe1","Pepe2","Al","Pepe3")
                .map(Usuario::new)
                .filter(u -> u.getNombre().contains("Pepe"))
                .findFirst().get();

        System.out.println(usuario);
    }
}
