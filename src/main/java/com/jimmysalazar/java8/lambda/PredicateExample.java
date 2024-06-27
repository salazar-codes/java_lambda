package com.jimmysalazar.java8.lambda;

import com.jimmysalazar.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Predicate recibe cualquier tipo y siempre retorna un boolean
        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(7);
        System.out.println("r = "+ resultado);

        Predicate<String> test2 = "ROLE_ADMIN"::equals; // role -> role.equals("ROLE_ADMIN");
        boolean resultado2 = test2.test("ROLE_ADMIN");
        System.out.println("r2 = "+ resultado2);

        BiPredicate<String, String> test3 = String::equals; // (a,b) -> a.equals(b);
        System.out.println("r3 = " + test3.test("jim","jim"));

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("pepe");
        b.setNombre("pepe");
        BiPredicate<Usuario,Usuario> t5 = PredicateExample::test;
        System.out.println("t5 = " + t5.test(a,b));
    }

    // Extrayendo el method reference
    private static boolean test(Usuario uA, Usuario uB) {
        return uA.getNombre().equals(uB.getNombre());
    }
}
