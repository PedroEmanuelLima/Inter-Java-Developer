package br.com.one.innovation.digital.aula01;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorvezes3 = valor -> valor* 3;

        int valor = 10;
        System.out.println("O resultadp é: "+calcularValorvezes3.apply(10));
    }
}
