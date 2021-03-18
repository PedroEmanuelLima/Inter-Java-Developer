package one.digitalinovetion.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        // Adicionar elementos.
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        // Remover elemento.
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        // Retorna a quantidade de itens.
        System.out.println(notasAlunos.size());

        // Navegar pela lista.
        Iterator<Double> it = notasAlunos.iterator();
        System.out.println("\nIterator:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nForEach: ");
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        // Limpar e chacar se está vazia.
        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());


    }
}
