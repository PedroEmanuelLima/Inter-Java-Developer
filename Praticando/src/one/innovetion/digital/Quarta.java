package one.innovetion.digital;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

// ............................
// Entrevista Embaraçosa      |
// ............................

class MinhaClasse {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String palavra = sc.nextLine();

            List<String> subStrings = todasSubstrings(palavra);
            List<String> palavras = todasPalavrasRepetidas(palavra, subStrings);

            if (palavras.size() > 0){
                for (String palavraRepetida: palavras){
                    System.out.println(palavraRepetida);
                }
            } else {
                System.out.println(palavra);
            }

        }
    }

    public static List<String> todasSubstrings(String str) {
        List<String> lista = new ArrayList<>();

        for (int tamanho = 1; tamanho <= str.length(); tamanho++){
            StringBuilder palavra = new StringBuilder();

            for (int i = 0; i <= str.length() - tamanho; i++){
                int j = i + tamanho - 1;

                for (int k = i; k <= j; k++){
                    palavra.append(str.charAt(k));
                }

                lista.add(palavra.toString());
                palavra.setLength(0);
            }
        }

        lista.removeAll(Collections.singleton(str));
        return lista.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> todasPalavrasRepetidas(String palavra, List<String> subSrings) {
        List<String> lista = new ArrayList<>();

        for (String subPalavra: subSrings){
            if (palavra.endsWith(subPalavra) && contarFimPalavra(palavra, subPalavra) > 1){
                lista.add(palavra.substring(0, palavra.length() - subPalavra.length()));
            }
        }
        return lista.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }

    public static int contarFimPalavra(String palavra, String fimPalavra) {
        int count = 0;

        String _palavra = palavra;
        while (_palavra.endsWith(fimPalavra)){
            count++;
            _palavra = _palavra.substring(0, _palavra.length() - fimPalavra.length());
        }

        return count;
    }

}