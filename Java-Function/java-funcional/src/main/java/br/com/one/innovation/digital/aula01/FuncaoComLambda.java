package br.com.one.innovation.digital.aula01;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr.".concat(valor);

        System.out.println(colocarPrefixoSenhorNaString.gerar("Pedro"));
    }
}