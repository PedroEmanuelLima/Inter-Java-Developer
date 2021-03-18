package br.com.one.innovation.digital.aula06;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {
    public static void main(String[] args) {
//        Collection<String> nomes = Arrays.asList("Peddro", "Emanuel", "Lima", "Almeida");
//        Collection<String> nomes = List.of("Peddro", "Emanuel", "Lima", "Almeida");
        Collection<String> nomes = Set.of("Peddro", "Emanuel", "Lima", "Almeida");

        System.out.println(nomes);
    }
}
