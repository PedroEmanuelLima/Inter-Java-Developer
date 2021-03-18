package one.digitalinovetion.optionals;

import java.util.Optional;

public class ExemploOptionalsEstados {
    public static void main(String[] args) {
        try {
            Optional<String> optionalString = Optional.of("Valor presente");

            System.out.println("Valor opcional que está presente:");
            optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

            Optional<String> optionalNull = Optional.ofNullable(null);

            System.out.println("\nValor opcional que não está presente:");
            optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

            Optional<String> emptyOptional = Optional.empty();

            System.out.println("\nValor opcional que ão está presente:");
            emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

            Optional<String> optionalNullErro = Optional.of(null);

            System.out.println("Valor opcional que lança um erro NullPointerException");
            optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
