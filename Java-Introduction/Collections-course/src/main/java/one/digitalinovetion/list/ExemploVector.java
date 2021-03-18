package one.digitalinovetion.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new ArrayList<>();

        // Adicionar elementos.
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");
        System.out.println(esportes);

        // Alterar o valor de uma posição por indice.
        esportes.set(2, "Ping Pong");

        // Remover um elemento por posição.
        esportes.remove(2);

        // Remover elemento por descrição(nome).
        esportes.remove("Handebol");

        System.out.println(esportes);

        //Retornar o primeiro item do vetor.
        System.out.println(esportes.get(0)+"\n");

        // Navegar pela lista.
        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
