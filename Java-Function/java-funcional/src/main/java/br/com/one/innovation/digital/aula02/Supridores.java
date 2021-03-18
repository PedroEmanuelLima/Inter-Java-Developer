package br.com.one.innovation.digital.aula02;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        // Não tem parametro, porém retorna algo, no Generics recebe o tipo de retorno
        Supplier<Pessoa> instaciaNewPessoa = () -> new Pessoa();
        Supplier<Pessoa> instaciaNewPessoa2 = Pessoa::new;

        System.out.println(instaciaNewPessoa.get());
        System.out.println(instaciaNewPessoa2.get());
    }
}

class Pessoa {
    private  String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Pedro";
        idade = 20;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
