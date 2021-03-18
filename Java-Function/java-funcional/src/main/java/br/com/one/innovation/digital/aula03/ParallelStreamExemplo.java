package br.com.one.innovation.digital.aula03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {

        long inicio, fim;

//        long inicio = System.currentTimeMillis();
//        IntStream.range(1,100000).forEach(num -> fatorial(num)); //Serial
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo de execução Serial :: "+(fim-inicio));
//
//        inicio = System.currentTimeMillis();
//        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num)); //Parallel
//        fim = System.currentTimeMillis();
//        System.out.println("Tempo de execução Parallel :: "+(fim-inicio));

        List<String> nomes = Arrays.asList("João", "Paulo", "Oliveira", "Santos");

        inicio = System.currentTimeMillis();
        nomes.parallelStream().forEach(System.out::println);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial :: "+(fim-inicio)+"\n");

        inicio = System.currentTimeMillis();
        nomes.parallelStream().forEach(System.out::println);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel :: "+(fim-inicio));

    }

    public static long fatorial(long nun){
        long fat = 1;

        for (long i = 2; i <= nun ; i++) {
            fat*=i;
        }
        return fat;
    }
}