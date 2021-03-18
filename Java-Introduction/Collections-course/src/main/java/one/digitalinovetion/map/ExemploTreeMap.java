package one.digitalinovetion.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap();

        // Adicionar elementos.
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        System.out.println(treeCapitais);

        // Retornar a chave do primeiro elemento no topo da aŕvore.
        System.out.println(treeCapitais.firstKey());

        // Retornar a chave do último elemento no fim da aŕvore.
        System.out.println(treeCapitais.lastKey());

        // Retornar so elementoabaixo na árvore.
        System.out.println(treeCapitais.lowerKey("SC"));

        // Retornar a chave do primeiro elemento acima na árvore.
        System.out.println(treeCapitais.higherKey("SC"));

        // Retorna o primeiro elemento na árvore.
        System.out.println(treeCapitais.firstEntry().getKey() + " - "+treeCapitais.firstEntry().getValue());

        // Retorna o último elemento na árvore.
        System.out.println(treeCapitais.lastEntry().getKey() + " - "+treeCapitais.lastEntry().getValue());

        // Exibir o map.
        System.out.println(treeCapitais);

        //remover primeiro elemento da árvore.
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey()+" - "+firstEntry.getValue());

        // Remover último elemento da árvore.
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey()+" - "+lastEntry.getValue());

        System.out.println("\n"+treeCapitais);

        // Navegação.
        System.out.println("\nNavegação com Iterator: ");
        Iterator<String> it = treeCapitais.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+" - "+treeCapitais.get(key));
        }

        System.out.println("\nNavegação com KeySet: ");
        for (String key: treeCapitais.keySet()){
            System.out.println(key+" ----- "+treeCapitais.get(key));
        }

        System.out.println("\nNavegação com EntrySet: ");
        for (Map.Entry<String, String> entry: treeCapitais.entrySet()){
            System.out.println(entry.getKey()+" ----- "+entry.getValue());
        }

    }
}
