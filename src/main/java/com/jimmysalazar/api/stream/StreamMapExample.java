package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {
        /*
        Stream<String> nombres = Stream
                .of("Pato","Paco","Pepa","Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
         */
        //nombres.forEach(System.out::println);
        //List<String> lista = nombres.collect(Collectors.toList()); // op. terminal
        //lista.forEach(System.out::println);


        Stream<Usuario> nombres = Stream
                .of("Pato","Paco","Pepa","Pepe")
                .map(Usuario::new) // .map(nombre -> new Usuario(nombre))
                .peek(u -> System.out.println(u.getNombre()))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.getNombre()));
    }
}
