package aulas.trabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com SimpleDateFormat
 */
public class Exercicio03 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

    }
}
