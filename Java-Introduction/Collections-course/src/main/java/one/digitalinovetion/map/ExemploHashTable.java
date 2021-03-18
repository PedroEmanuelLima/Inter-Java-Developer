package one.digitalinovetion.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Adicionar elmentos
        estudantes.put("Carlos", 21);
        estudantes.put("Maria", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);
        System.out.println(estudantes);

        // Atualizar.
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        // Remover um elemento por key
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        // Recuperar valor de um elemento por key
        System.out.println(estudantes.get("Maria"));
        System.out.println(estudantes.size());

        // Navegação
        System.out.println("\nNavegação com KeySet: ");
        for (String key: estudantes.keySet()){
            System.out.println(key+" ----- "+estudantes.get(key));
        }

        System.out.println("\nNavegação com EntrySet: ");
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey()+" ----- "+entry.getValue());
        }

    }
}
