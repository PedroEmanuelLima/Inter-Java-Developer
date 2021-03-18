package aulas.oo.part02.construtores.exercicio;

public class Carro {

    private String marca;
    private String modelo;
    private String ano;
    private String variante;

    public  Carro(String modelo, String marca, String ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getAno() {
        return ano;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

}
