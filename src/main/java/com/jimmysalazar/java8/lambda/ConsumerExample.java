package com.jimmysalazar.java8.lambda;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        consumidorBi.accept("pepe", 20);

        // Remplazando lammbda con method reference
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello lambda");

        List<String> nombres = Arrays.asList("jimmy","salz","pepe","mel");
        nombres.forEach(consumer2);

        // Usando el supplier
        Supplier<Usuario> crearUusario = () -> new Usuario();
        // Method reference
        Supplier<Usuario> crearUusario2 = Usuario::new;

        // Usuario usuario = new Usuario();
        Usuario usuario = crearUusario2.get();

        /* // tradicional
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        };
        */

        // con method references
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario,"Jimmy");
        System.out.println("Nombre de usuario:" + usuario.getNombre());


        Supplier<String> proveedor = () -> {
            return "Hola mundo desde el proveedor";
        };
        // Simplificado
        Supplier<String> proveedor2 = () -> "Hola mundo desde el proveedor";

        System.out.println(proveedor2.get());
    }
}
