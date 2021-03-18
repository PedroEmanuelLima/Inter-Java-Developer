package br.com.one.innovation.digital.aula02;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        // Sem retorno, quer apnas receber algo e executar um comando sem retorno, no Generics recebe só o tipo do parameto
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello Word!");
        imprimirUmaFrase2.accept("Hello Word!");

    }
}
