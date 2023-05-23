package com.ejemplo.lambdas.S108N2Ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> elementos = Arrays.asList("7", "casa", "3", "java", "5", "examen", "a4");

        // Ordenar alfabéticamente por el primer carácter
        elementos.sort(Comparator.comparing(s -> s.charAt(0)));

        // Ordenar las cadenas que contienen una "e" primero
        elementos.sort(Comparator.comparing(s -> !s.contains("e")));

        // Modificar los elementos que contienen una 'a'
        elementos.replaceAll(s -> s.replace("a", "4"));

        // Mostrar solo los elementos numéricos
        elementos.stream()
                .filter(s -> s.matches("-?\\d+(\\.\\d+)?"))
                .forEach(System.out::println);
    }
}
