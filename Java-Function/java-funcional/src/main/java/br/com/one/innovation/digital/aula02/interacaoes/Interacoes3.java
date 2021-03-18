package br.com.one.innovation.digital.aula02.interacaoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes3 {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirODobroDeCadaItem(numeros);


        List<String> profissoes = new ArrayList<>();
        profissoes.add("Developer");
        profissoes.add("Tester");
        profissoes.add("Project Maneger");
        profissoes.add("Maneger Quality");

        profissoes.stream()
                .filter(profissao -> profissao.contains("Maneger"))
                .forEach(System.out::println);
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

    public static void imprimirODobroDeCadaItem(Integer... numeros) {
        System.out.println("Imprimindo com for: ");
        for (Integer numero: numeros){
            System.out.println(numero*2);
        }

        System.out.println("\nImprimindo com ForEach: ");
        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }

}
