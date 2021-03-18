package aulas.oo.part03.heranca.exercicioPolimorfismo;

public class Gerente extends  Funcionario{
    private String t = "Gerente";

    public void Gerente(){
        super.setTipo(t);
    }

    @Override
    public double imposto() {
        return super.getSalario()*0.1;
    }
}
