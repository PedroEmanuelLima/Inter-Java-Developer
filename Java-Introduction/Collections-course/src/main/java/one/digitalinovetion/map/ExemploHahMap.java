package one.digitalinovetion.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHahMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        // Adicionar elementos.
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);
        System.out.println(campeoesMundiaisFifa);

        // Atualizar valor por chave.
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);

        // Retornar valor por chave.
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        // Retornar se existe uma elemento com determinada chave.
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Remover elemento por chave.
        campeoesMundiaisFifa.remove("França");
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Retorna s existe algum elemento com determinado valor.
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        // Tamanho do Map.
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println(campeoesMundiaisFifa);

        // Navegação.
        System.out.println("\nNavegação com entrySet: ");
        for (Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey()+" ----- "+entry.getValue());
        }

        System.out.println("\nNavegação com KeySet: ");
        for (String key: campeoesMundiaisFifa.keySet()){
            System.out.println(key+" ----- "+campeoesMundiaisFifa.get(key));
        }

        // Verificar e limpar Map.
        System.out.println(campeoesMundiaisFifa.size());
        campeoesMundiaisFifa.clear();
        System.out.println(campeoesMundiaisFifa.size());

    }
}
