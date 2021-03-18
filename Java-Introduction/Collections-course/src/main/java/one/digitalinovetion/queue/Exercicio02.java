package one.digitalinovetion.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio02 {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        System.out.println("------------------Navegação:------------------");
        for (String name: names){
            System.out.println(name);
        }

        System.out.println("\n1º item removendo: ");
        System.out.println(names.peek());
        System.out.println(names);

        System.out.println("\n1º item sem remover: ");
        System.out.println(names.poll());
        System.out.println(names);

        System.out.println("\nAdicionando novo elemento: ");
        System.out.println(names);
        names.add("Daniel");
        System.out.println(names);

        System.out.println("\nTamanho da lista: ");
        System.out.println(names.size());

        System.out.println("\nA lista está vazia: "+names.isEmpty());

        System.out.println("\nCarlos está na fila: "+names.contains("Carlos"));

        names.clear();
        System.out.println(names.poll());
    }
}
