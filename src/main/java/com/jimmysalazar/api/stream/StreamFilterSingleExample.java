package com.jimmysalazar.api.stream;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterSingleExample {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato","Paco","Pepa","Pepe1","Pepe2","Al","Pepe3")
                .map(Usuario::new)
                .filter(u -> u.getNombre().contains("Pepex"))
                .peek(u -> System.out.println(u.getNombre()));

        Optional<Usuario> usuario = nombres.findFirst(); // devuelve un Optional
        //System.out.println(usuario.get()); // get devuelve el valor del Optional.
        //System.out.println(usuario.orElse(new Usuario("Default")).getNombre()); // returns custom User
        //System.out.println(usuario.orElseThrow()); // returns Exception

        if(usuario.isPresent()) System.out.println(usuario.get().getNombre());
        if(usuario.isEmpty()) System.out.println("No se encontró");
    }
}
