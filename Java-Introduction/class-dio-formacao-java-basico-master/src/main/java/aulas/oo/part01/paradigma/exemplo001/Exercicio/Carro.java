package aulas.oo.part01.paradigma.exemplo001.Exercicio;

public class Carro {
    private int qtnPessoa = 5;
    private int tem = 0;

    public void entrar() {
        if (tem >= qtnPessoa){
            System.out.println("Capacidade maxima alcançada.");
        } else{
            tem++;
            System.out.println("Mais alguém entrou no carro.");
        }
    }
    public void sair(){
        if (tem > 0){
            --tem;
            System.out.println("Alguém saiu do carro.");
        } else{
            tem++;
            System.out.println("Não há ninguém dentro do carro.");
        }
    }
}
