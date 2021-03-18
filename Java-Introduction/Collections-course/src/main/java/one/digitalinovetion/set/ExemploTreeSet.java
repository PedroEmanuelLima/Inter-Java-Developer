package one.digitalinovetion.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Montando  arvore
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

        // Retornar o primeiro elemento do topo da árvore.
        System.out.println(treeCapitais.first());

        // Retornar o último elemento no fim da árvore.
        System.out.println(treeCapitais.last());

        // Retornar o primeiro elemento abaixo na árvore com parametro.
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retornar o primeiro elemento acima na árvore com parametro.
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todos os elementos no console.
        System.out.println(treeCapitais);

        // Retornar o primeiro elemento do topo da árvore removendo-o.
        System.out.println(treeCapitais.pollFirst());

        // Retornar o último elemento no fim da árvore removendo-o.
        System.out.println(treeCapitais.pollLast());

        // Exibe todos os elementos no console.
        System.out.println(treeCapitais);

        // Navegar pela lista.
        System.out.println("\nIterator: ");
        Iterator<String> it = treeCapitais.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\nForEach: ");
        for (String capital: treeCapitais){
            System.out.println(capital);
        }

    }
}
