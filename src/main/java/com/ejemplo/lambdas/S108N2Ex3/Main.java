package com.ejemplo.lambdas.S108N2Ex3;

public class Main {
    public static void main(String[] args) {
        Operacion suma = () -> 5 + 3;
        float resultadoSuma = suma.operacion();
        System.out.println("Resultado suma: " + resultadoSuma);

        Operacion resta = () -> 10 - 2;
        float resultadoResta = resta.operacion();
        System.out.println("Resultado resta: " + resultadoResta);

        Operacion multiplicacion = () -> 4 * 6;
        float resultadoMultiplicacion = multiplicacion.operacion();
        System.out.println("Resultado multiplicación: " + resultadoMultiplicacion);

        Operacion division = () -> 15 / 3;
        float resultadoDivision = division.operacion();
        System.out.println("Resultado división: " + resultadoDivision);
    }
}

