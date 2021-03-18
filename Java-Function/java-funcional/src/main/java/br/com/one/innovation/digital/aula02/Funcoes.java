package br.com.one.innovation.digital.aula02;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        // Recebe dois tipos no Generics o tipo de retorno e o tipo do paramentro
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroComDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("Pedro"));
        System.out.println(converterStringParaInteiroComDobro.apply("5"));
    }
}
