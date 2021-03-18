package one.digitalinovetion.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercicio03 {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> it = numeros.iterator();
        System.out.println("\nNavegação:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nRemovendo 1º item...\nItem "+numeros.pollFirst()+" removido.");

        System.out.println("\nAdicionando novo elemento...\nItem adicionado: "+numeros.add(23));

        System.out.println("\nTamanho do Set: "+numeros.size());

        System.out.println("\nO Set está vazio: "+numeros.isEmpty());

    }
}
