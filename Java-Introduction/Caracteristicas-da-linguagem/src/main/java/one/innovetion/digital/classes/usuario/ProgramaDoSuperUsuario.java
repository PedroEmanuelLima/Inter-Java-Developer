package one.innovetion.digital.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "12345");

        superUsuario.getLogin();
        superUsuario.getSenha();
    }
}
