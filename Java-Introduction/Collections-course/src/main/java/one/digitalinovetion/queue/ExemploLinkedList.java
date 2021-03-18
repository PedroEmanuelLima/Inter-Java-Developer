package one.digitalinovetion.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        // Criar Fila de dados.
        Queue<String> filaDeBanco = new LinkedList<>();

        // Adicionar elementos a fila.
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Anderson");
        System.out.println(filaDeBanco);

        // Retornar o primeiro elemento o removendo da fila.
        String clienteAtender = filaDeBanco.poll();
        System.out.println("\n"+clienteAtender);
        System.out.println(filaDeBanco);

        // Retornar o primeiro elemento sem removendo da fila.
        clienteAtender = filaDeBanco.peek();
        System.out.println("\n"+clienteAtender);
        System.out.println(filaDeBanco);

        // Retorna o primeiro elemento sem o remover, se a lista estiver vazia retorna uma exception.

        String primeiroClienteErro = filaDeBanco.element();
        System.out.println("\n" + primeiroClienteErro);
        System.out.println(filaDeBanco);

        // Teste de exception com fila vazia
        try {
            //filaDeBanco.clear();
            primeiroClienteErro = filaDeBanco.element();
            System.out.println("\n" + primeiroClienteErro);
            System.out.println(filaDeBanco);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Navegar pela fila.
        System.out.println("\n-----Navegando com forEach: ------");
        for (String clientes: filaDeBanco){
            System.out.println(clientes);
        }

        System.out.println("\n-----Navegando com Iterator: ------");
        Iterator<String> it = filaDeBanco.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Tmanho e saber se está vazia.
        System.out.println("\n"+filaDeBanco.size());
        System.out.println(filaDeBanco.isEmpty());


    }
}
