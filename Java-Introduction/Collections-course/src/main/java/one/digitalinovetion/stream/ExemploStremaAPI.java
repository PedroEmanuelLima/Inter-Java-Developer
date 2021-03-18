package one.digitalinovetion.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStremaAPI {
    public static void main(String[] args) {

        // Criar uma coleção
        List<String> estudantes = new ArrayList<>();

        // Adicionar elementos na coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println(estudantes.stream().collect(Collectors.groupingBy((e) -> e.substring(0, 1))));

        // Retorna a contagem de elementos do Stream
        System.out.println("Contagem: "+estudantes.stream().count());

        // Retorna o elemanto com maior número de letras
        System.out.println("\nMaior número de letras: "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemanto com menor número de letras
        System.out.println("\nMenor número de letras: "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna o elemento que tem R no nome
        System.out.println("\nTem a letra R no nome: "+estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorn uma nova coleção, com os nomes concatenados e a quantidade de letras de casda um
        System.out.println("\nRetorna uma nova coleção com a quantidade de letras: "+ estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retornar os elementos com limite
        System.out.println("\nRetornar os três primeiros elementos: "+estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exebir cada elemento e por fim retornar outra coleção
        System.out.println("\nRetorna os elementos: "+estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exebir cada elemento sem retornar outra coleção
        System.out.println("\nRetornar os elementos movamente:");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elemento conter um caractere
        System.out.println("\nTodos os elemento tem W no nome: "+ estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elemento conter um caractere
        System.out.println("\nTem algum elemento com a nonome: "+ estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna true se nenhum dos elemento conter um caractere
        System.out.println("\nNão tem nenhum elemento com a no nome: "+ estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // Retornar o primeiro elemento no console
        System.out.println("\nRetorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("\nOperação encadeada: ");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
            .peek(System.out::println)
            .filter((estudante) ->
                    estudante.toLowerCase().contains("r"))
//            .collect(Collectors.toList()));
//            .collect(Collectors.joining(", ")));
//            .collect(Collectors.toSet()));
            .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));
    }
}
