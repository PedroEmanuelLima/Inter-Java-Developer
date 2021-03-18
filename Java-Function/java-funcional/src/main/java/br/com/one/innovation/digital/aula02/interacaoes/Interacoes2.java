package br.com.one.innovation.digital.aula02.interacaoes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes2 {
    public static void main(String[] args) {
        String[] nomes = {"Pedro", "João", "Paulo", "Santos", "João", "Oliveira", "Java"};

        imprimirTodosOsNomes(nomes);

    }

    public static void imprimirTodosOsNomes(String... nomes) {
        System.out.println("Imprimindo Pelo For:");
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("\nImprimindo Pelo ForEach:");
        Stream.of(nomes)
                .forEach(System.out::println);
    }

}
