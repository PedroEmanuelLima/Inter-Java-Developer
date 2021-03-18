package br.com.one.innovation.digital.aula02.interacaoes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Pedro", "João", "Paulo", "Santos", "João", "Oliveira", "Java"};
        imprimirNomesFiltrados(nomes);

    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimirFor = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")){
                nomesParaImprimirFor+=" "+nomes[i];
            }
        }
        System.out.println(nomesParaImprimirFor);

        String nomesParaImprimirStream = Stream.of(nomes)
            .filter(nome -> nome.equals("João"))
            .collect(Collectors.joining(" "));
        System.out.println(nomesParaImprimirStream);

    }
}
