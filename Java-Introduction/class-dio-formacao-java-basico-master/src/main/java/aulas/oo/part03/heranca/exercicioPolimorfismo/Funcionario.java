package aulas.oo.part03.heranca.exercicioPolimorfismo;

public class Funcionario {

    private String tipo;
    private  double salario;

    public void Funcionario(String tipo, double salario) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double imposto(){ return salario*0.01; }
}
