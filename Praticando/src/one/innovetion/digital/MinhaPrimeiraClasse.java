package one.innovetion.digital;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// ............................
//Abreviando Posts de blogs   |
// ............................

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader inReader;
        inReader = new BufferedReader(new InputStreamReader(System.in));
        boolean leia = true;
        String line = inReader.readLine();

        while (!line.equals(".")) {
            abreviaPalavrasDaFrase(Arrays.asList(line.toLowerCase(Locale.ROOT).split(" ")));
            line = inReader.readLine();
            if(line.equals(".")){
                System.exit(0);
            }
        }
    }

    public static void abreviaPalavrasDaFrase(List<String> frase) throws IOException {
        // processa a frase se a linha conter 1000 ou menos caracter
        // if (isFraseMenorIgualHa1000Caracter(frase)) {
        processaFrase(frase);
        //}
    }

    private static void processaFrase(List<String> fraseOriginal) {
        Set<String> listIniciaisValidas = getListIniciaisDasPalavras(fraseOriginal);
        List<String> listPalavrasHaSeremAbrevidas = new ArrayList<>();
        String palavra = "";
        int cnt = 0;

        // para todas as iniciais das palavras que foram informadas
        for (String inicial : listIniciaisValidas) {
            palavra = getPalavraHaSerAbreviada(fraseOriginal, inicial);
            listPalavrasHaSeremAbrevidas.add(palavra);
            cnt++;
        }
        System.out.println(abreviaFrase(fraseOriginal, listPalavrasHaSeremAbrevidas));
        System.out.println(listPalavrasHaSeremAbrevidas.size()); // qtd de palavras alteradas
        legendaDasPalavrasAbreviadas(listPalavrasHaSeremAbrevidas);
    }

    private static void legendaDasPalavrasAbreviadas(List<String> listPalavrasHaSeremAbrevidas) {
        Collections.sort(listPalavrasHaSeremAbrevidas);
        listPalavrasHaSeremAbrevidas.stream().map(s -> s.substring(0,1).concat(". = ").concat(s)).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static String abreviaFrase(List<String> fraseOriginal, List<String> listPalavrasHaSeremAbrevidas){
        for(int i = 0; i < listPalavrasHaSeremAbrevidas.size(); i++){
            for(int j = 0; j <  fraseOriginal.size(); j++){
                if(listPalavrasHaSeremAbrevidas.get(i).equals(fraseOriginal.get(j))){
                    String palavra = listPalavrasHaSeremAbrevidas.get(i);
                    fraseOriginal.set( j ,palavra.substring(0,1).concat("."));
                }
            }
        }
        return fraseOriginal.stream().collect(Collectors.joining(" "));
    }

    private static String getPalavraHaSerAbreviada(List<String> ListaDePalavras, String letraDaAbrevicao) {
        List<String> listPalavrasIniciadasComX =  getListPalavrasValidas(ListaDePalavras, letraDaAbrevicao);
        List<String>  maiorPalavra = getMaiorPalavraDaLista(listPalavrasIniciadasComX);
        List<List<String>> palavrasRepetidasMaiorQueDoisCaracter = new ArrayList<>();
        List<String> todasPalavrasRepetidas = new ArrayList<>();

        // remove as palavras repetidas e cria a lista de palavras repetidas maior que dois caracter
        for(String palavra : listPalavrasIniciadasComX.stream().collect(Collectors.toSet())){
            todasPalavrasRepetidas = getListPalavrasRepetidas(listPalavrasIniciadasComX, palavra);
            if(todasPalavrasRepetidas.size() >= 2){
                palavrasRepetidasMaiorQueDoisCaracter.add(todasPalavrasRepetidas); //= Collections.singletonList(todasPalavrasRepetidas);
            }
        }

        // HasMap das palavras repetidas e sua economia no texto
        Map<String,Integer> palavraHeEconomia = new HashMap<String,Integer>();
        for(List<String> list :palavrasRepetidasMaiorQueDoisCaracter){
            String palavra = list.get(0);
            palavraHeEconomia.put(palavra, list.stream().map(s -> s.substring(2)).collect(Collectors.joining()).length());
        }

        int economiaPalavraRepetida = 0;
        String palavraRepetidaMaiorEconomia = "";
        // obtem a palavra repetida de maior economia no texto
        for(String key: palavraHeEconomia.keySet()){
            int valor = palavraHeEconomia.get(key);

            if(valor > economiaPalavraRepetida){
                economiaPalavraRepetida = valor;
                palavraRepetidaMaiorEconomia = key.toString();
            }
        }

        // economia da maior palavra no texto
        int economiaMaiorPalavra =  maiorPalavra.get(0).toString().substring(2).length();

        String palavraHaSerAbreviada = "";
        // A palavra a ser abreviada é que retornar maior economia no texto
        if(economiaMaiorPalavra > economiaPalavraRepetida){
            palavraHaSerAbreviada = maiorPalavra.get(0).toString();
        }else{
            palavraHaSerAbreviada = palavraRepetidaMaiorEconomia;
        }
        return palavraHaSerAbreviada;
    }

    private static List getMaiorPalavraDaLista(List<String> todasPalavrasIniciadasComX) {
        return  todasPalavrasIniciadasComX.stream().max(Comparator.comparingInt(String::length)).stream().collect(Collectors.toList());
    }

    private static List getListPalavrasRepetidas(List<String> listPalavras, String palavra) {
        return listPalavras.stream().filter(s -> s.equals(palavra)).collect(Collectors.toList());
    }

    // retorna somente as palavras iniciadas com a letra X e maior que dois caracter e menor que 30
    private static List<String> getListPalavrasValidas(List<String> palavras, String letra) {
        return palavras.stream().filter(s -> s.startsWith(letra)).filter(s -> (s.length() > 2 && s.length() <= 30)) // retorna somente palavras maior que dois caracter e menor que ou igual a 30
                .collect(Collectors.toList());
    }

    private static Set<String> getListIniciaisDasPalavras(List<String> listPalavras) {
        Set<String> listaDasIniciais = new HashSet<String>();
        for (char letra: getLetrasDoAfabeto()) {
            if(!listPalavras.stream().filter(s -> s.startsWith(String.valueOf(letra))).filter(s -> (s.length() > 2 && s.length() <= 30)).collect(Collectors.toSet()).isEmpty()){
                listaDasIniciais.add(String.valueOf(letra));
            }
        }
        return listaDasIniciais;
    }

    private static boolean isFraseMenorIgualHa1000Caracter(List<String> listaDePalavras) {
        return listaDePalavras.stream().collect(Collectors.joining(",")).length() <= 1000;
    }

    private static char[] getLetrasDoAfabeto(){
        return  IntStream.rangeClosed('a', 'z') .mapToObj(c -> " " + (char) c).collect(Collectors.joining()).toCharArray();
    }
}