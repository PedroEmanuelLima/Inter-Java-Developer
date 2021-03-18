package aulas.oo.part03.heranca.exercicioPolimorfismo;

public class Executar {
    public static void main(String[] args) {
        Atendente a = new Atendente();
        a.setSalario(1000);
        //System.out.println(a.getTipo());
        System.out.println(a.imposto());

        Gerente g = new Gerente();
        g.setSalario(2000);
        //System.out.println(g.getTipo());
        System.out.println(g.imposto());

        Surpevisor s = new Surpevisor();
        s.setSalario(3000);
        //System.out.println(s.getTipo());
        System.out.println(s.imposto());
    }
}
