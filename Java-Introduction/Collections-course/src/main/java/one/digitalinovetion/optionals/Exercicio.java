package one.digitalinovetion.optionals;

import java.util.Optional;

public class Exercicio {
    public static void main(String[] args) {
//        try{
//
//            Optional<String> option1 = Optional.of("Presente");
//
//            option1.ifPresent(System.out::println);
//            option1.orElseThrow(IllegalStateException::new);
//            option1.ifPresentOrElse(System.out::println, () -> System.out.println("OptionL vazio"));
//            option1.map((valor) -> valor.concat(" Transformado")).ifPresent(System.out::println);
//
//            if (option1.isPresent()){
//                String v = option1.get();
//            }
//
//
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        try{
//
//            Optional<String> option2 = Optional.ofNullable(null);
//
//            option2.ifPresent(System.out::println);
//            option2.orElseThrow(IllegalStateException::new);
//            option2.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
//            option2.map((valor) -> valor.concat(" Transformado")).ifPresent(System.out::println);
//
//            if (option2.isPresent()){
//                String v = option2.get();
//            }
//
//
//        }catch (Exception e){
//            System.out.println(e);
//        }

        try{

            Optional<String> option3 = Optional.empty();

            option3.ifPresent(System.out::println);
            option3.orElseThrow(IllegalStateException::new);
            option3.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
            option3.map((valor) -> valor.concat(" Transformado")).ifPresent(System.out::println);

            if (option3.isPresent()){
                String v = option3.get();
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
