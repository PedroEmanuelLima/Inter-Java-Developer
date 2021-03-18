package aulas.oo.part03.heranca.exercicioPolimorfismo;

public class Surpevisor extends  Funcionario{
    private String t = "Surpevisor";

    public void Surpevisor(){
        super.setTipo(t);
    }

    @Override
    public double imposto() {
        return super.getSalario()*0.05;
    }
}
