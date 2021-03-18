package one.innovetion.digital;
// ...................................
// Validador de senhas com requisitos |
// ...................................

import java.util.Scanner;

public class QuintaSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,32}";
        String pattern2 = "(?=.*\\p{Punct}).{1,}";

        while (sc.hasNext()){
            String senha = sc.nextLine();
            if (senha.matches(pattern) && !senha.matches(pattern2) && !senha.contains(" ")) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
        sc.close();
    }
}