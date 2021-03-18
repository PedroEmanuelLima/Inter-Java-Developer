package one.digitalinovetion.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
    // Criando lista
        List<String> nomes = new ArrayList<>();

    // Adicionar vários elementos a lista
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("José");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

    // Alterar um elemento apartir do indice.
        nomes.set(3, "Larissa");
        System.out.println(nomes);

    // Reordenação por ordem alfabetica.
        Collections.sort(nomes);
        System.out.println(nomes);

    // Outra alteração de um elemento apartir do indice.
        nomes.set(3, "Wesley");
        System.out.println(nomes);

    // Remover um elemento apartir do indice.
        nomes.remove(2);
        System.out.println(nomes);

    // Remoção por elemento.
        nomes.remove("Wesley");
        System.out.println(nomes);

    // Verificar se um elemento existe e qual o indice dele.
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

    // Retornar valor a partir de uma posição.
        String nome = nomes.get(1);
        System.out.println(nome);

    // Tamanho da lista.
        int tamanho = nomes.size();
        System.out.println(tamanho);

    // Remoção de elemento e tamanho após a remoção.
        nomes.remove("Maria");
        tamanho = nomes.size();
        System.out.println(tamanho);

    // Verificar se existe determinado elemento.
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

    // Verificar se a lista está vazia.
        boolean listaVazia  = nomes.isEmpty();
        System.out.println(listaVazia);

    // Limpar a lista e verificar se está vazia.
        //nomes.clear();
        listaVazia  = nomes.isEmpty();
        System.out.println(listaVazia);

    // Navegação por uma lista.
        System.out.println("\n--------------------Navegação com ForEach:-----------------");
        for (String elemento: nomes){
            System.out.println("---> "+elemento);
        }
        System.out.println("\n--------------------Navegação con Iteraitor:-----------------");
        Iterator<String> it = nomes.iterator();
        while (it.hasNext()){
            System.out.println("--> "+it.next());
        }
    }
}
