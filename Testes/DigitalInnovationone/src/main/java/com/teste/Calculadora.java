package com.teste;

public class Calculadora {

    public int Somar(String expressao) {
        int soma = 0;
        for (String valorSoma: expressao.split("\\+")) {
            soma += Integer.valueOf(valorSoma);
        }

        System.out.println(soma);
        return soma;
    }
}
