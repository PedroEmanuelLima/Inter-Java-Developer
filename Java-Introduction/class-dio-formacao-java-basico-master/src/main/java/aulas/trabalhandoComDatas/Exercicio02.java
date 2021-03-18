package aulas.trabalhandoComDatas;

import javax.swing.*;
import java.util.Calendar;

public class Exercicio02 {
    public static void main(String[] args) {

        Calendar vence = Calendar.getInstance();
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês:"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dias:"));
        vence.set(ano, mes-1, dia);

        Calendar carencia = Calendar.getInstance();
        carencia = vence;
        carencia.add(Calendar.DATE, 10);

        if (carencia.get(Calendar.DAY_OF_WEEK) == 1){
            carencia.add(Calendar.DATE, 1);
        } else if (carencia.get(Calendar.DAY_OF_WEEK) == 7){
            carencia.add(Calendar.DATE, 2);
        }

        System.out.printf("Você tem até %tD para efetuar o pagamento de sua fatura.", carencia);
    }
}
