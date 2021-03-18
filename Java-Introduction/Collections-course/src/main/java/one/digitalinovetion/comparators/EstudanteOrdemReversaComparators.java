package one.digitalinovetion.comparators;

import java.util.Comparator;

public class EstudanteOrdemReversaComparators implements Comparator<Estudante> {


    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e1.getIdade() - e1.getIdade();
    }
}
