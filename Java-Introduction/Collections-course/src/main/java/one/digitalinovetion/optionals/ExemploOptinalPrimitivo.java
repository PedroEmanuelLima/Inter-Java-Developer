package one.digitalinovetion.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptinalPrimitivo {
    public static void main(String[] args) {

        System.out.println("*** Valor inteiro opcional ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("\n*** Valor decimal opcional ***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("\n*** Valor longo opcional ***");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }
}
