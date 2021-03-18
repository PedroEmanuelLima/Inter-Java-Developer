package one.digitalinovetion.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercico01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larrissa");
        nomes.add("João");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes.get(0));
        System.out.println(nomes.get(4));

        nomes.remove("João");

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);
//        for (String nome: nomes2){
//            nomes.add(nome);
//        }

        Collections.sort(nomes);

        System.out.println(nomes);

        System.out.println(nomes.isEmpty());

    }
}
