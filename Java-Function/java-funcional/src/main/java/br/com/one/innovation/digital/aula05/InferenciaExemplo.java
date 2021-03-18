package br.com.one.innovation.digital.aula05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    // O var precida de um escopo, a nível de classe não é possível criar variavél com var
    //private var nome = new String("Nome");

    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        // Fazendo um get em um endpoit
        var url = new URL("https://docs.oracle.com/javase/10/language/");

        // Abrindo conexão com a URL
        var urlConnection = url.openConnection();

        // getInputStream -> Atribuir a um input todas as informações que estão vindo da requisição
        // InputStreamReader -> Converter input para reader, para escolher qual trabalhar
        // BufferedReader -> Separar por linhas
        // Try with resource
        try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // O var não pode se utilizado como tipo de parâmetro
    public static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros) {
        // Não é possível utilizar o var em variaveis locais não inicializadas
        int sum;

        if (numeros.length > 0) {
            sum = 0;

//            for (var numero: numeros){
//                sum += numero;
//            }

            for (var i = 0; i < numeros.length; i++){
                sum+= numeros[i];
            }

            System.out.println("A soma é: "+sum);
        }
    }
}
