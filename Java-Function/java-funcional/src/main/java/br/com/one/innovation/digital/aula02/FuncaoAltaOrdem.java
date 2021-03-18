package br.com.one.innovation.digital.aula02;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo MULT = (a, b) -> a*b;
        Calculo DIVI = (a, b) -> a/b;

        // Função de alta orde elas recebem ou retornam outra função
        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(MULT, 7, 3));
        System.out.println(executarOperacao(DIVI, 4, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

interface Calculo {
    public int calcular(int a, int b);
}