package one.innovetion.digital;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ............................
// Conjuntos bons ou ruins    |
// ............................

public class MinhaSegundaClasse {
    public static void main(String[] args) throws IOException {

        Integer n;
        String palavra;
        Set<String> palavras = new HashSet<>();
        boolean ehBom;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (n > 0){
            palavras.clear();
            ehBom = true;
            for (int i = 1; i <= n; i++ ){
                palavra = sc.next().toLowerCase();
                if (checarSePalavraExiste(palavra, palavras) && ehBom){
                    ehBom = false;
                }
                palavras.add(palavra);
            }

            if (ehBom){
                System.out.println("Conjunto Bom");
            }else {
                System.out.println("Conjunto Ruim");
            }
            n = sc.nextInt();

        }
    }

    public static boolean checarSePalavraExiste(String palavra, Set<String> palavras){
        boolean exist = false;
        if (palavras.isEmpty()){
            exist = false;
        }
        if (palavras.contains(palavra)){
            exist = true;
        }
        if (!exist) {
            for (String p : palavras) {
                if (p.startsWith(palavra) || palavra.startsWith(p)) {
                    exist = true;
                }
            }
        }
        return exist;
    }
}