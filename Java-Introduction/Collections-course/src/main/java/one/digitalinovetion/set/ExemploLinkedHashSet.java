package one.digitalinovetion.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adicionar elementos.
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);
        System.out.println(sequenciaNumerica);

        // Remover elemento.
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de itens.
        System.out.println(sequenciaNumerica.size());

        // Navegar pela lista.
        Iterator<Integer> it = sequenciaNumerica.iterator();
        System.out.println("\nIterator:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nForEach: ");
        for (Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        // Limpar e chacar se está vazia.
        //sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
