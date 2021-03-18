package br.com.one.innovation.digital.aula01.FatorialRecursivo;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(13000));
    }
    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
    public static double fatorialComTailCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1, numero*valor);
    }
}
