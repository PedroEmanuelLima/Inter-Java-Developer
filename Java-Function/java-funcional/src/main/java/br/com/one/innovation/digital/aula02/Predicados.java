package br.com.one.innovation.digital.aula02;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        // Recebe um valor e retorna um booleram apartir de uma operação, no Generics recebe o tipo do parametro de entrada
//        Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio = String::isEmpty;

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Pedro"));
    }
}
