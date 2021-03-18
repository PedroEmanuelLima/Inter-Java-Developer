package one.digitalinovetion.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio04 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(4);
        numeros.add(2);
        numeros.add(23);
        numeros.add(14);
        numeros.add(55);

        numeros.add(null);
        System.out.println(numeros);
        Iterator<Integer> it = numeros.iterator();
        System.out.println("\nNavegação:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nRemovendo 1º item...\nItem removido: "+numeros.remove(3));

        System.out.println("\nAdicionando novo elemento...\nItem adicionado: "+numeros.add(23));

        System.out.println("\nTamanho do Set: "+numeros.size());

        System.out.println("\nO Set está vazio: "+numeros.isEmpty());

    }
}
