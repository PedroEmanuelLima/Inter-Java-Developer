package br.com.one.innovation.digital.aula06;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> metade = numero -> numero/2.0;
        Function<Integer, Double> metade02 = (var numero) -> numero/2.0;
    }
}
