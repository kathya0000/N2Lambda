package com.ejemplo.lambdas.S108N2Ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 55, 44);
        String result = getStringFromList(numbers);
        System.out.println(result);
    }

    public static String getStringFromList(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}

