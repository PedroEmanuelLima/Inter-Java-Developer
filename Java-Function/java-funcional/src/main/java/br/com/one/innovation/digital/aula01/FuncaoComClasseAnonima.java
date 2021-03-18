package br.com.one.innovation.digital.aula01;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String s) {
                return "Sr.".concat(s);
            }
        };

        System.out.println(colocarPrefixoSenhorNaString.gerar("Pedro"));
    }
}
