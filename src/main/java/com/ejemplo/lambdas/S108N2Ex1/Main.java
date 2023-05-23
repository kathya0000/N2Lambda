package com.ejemplo.lambdas.S108N2Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Alberto", "María", "Arturo");

        List<String> nombresFiltrados = nombres.stream()
                .filter(nombre -> nombre.startsWith("A") && nombre.length() == 3)
                .collect(Collectors.toList());

        System.out.println(nombresFiltrados);
    }
}

