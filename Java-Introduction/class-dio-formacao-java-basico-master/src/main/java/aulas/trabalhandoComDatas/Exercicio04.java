package aulas.trabalhandoComDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercicio04 {
    public static void main(String[] args) {
        LocalDateTime variavel = LocalDateTime.of(2010,05, 15,10,00, 00);

        LocalDateTime variavel2 = variavel.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(variavel);
        System.out.println(variavel2);
    }
}
