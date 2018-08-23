package br.edu.varela.diego;


import java.util.Arrays;
import java.util.List;

class Mediana {

    double calcular(Double[] valores) {
        if (valores == null) throw new VazioOuNuloException();

        List<Double> valoresEmLista = Arrays.asList(valores);

        valoresEmLista.sort((n1, n2) -> {
            if (n1 < n2) return -1;
            if (n1 > n2) return 1;
            return 0;
        });

        if (valoresEmLista.size() / 2 != 0) {
            return valoresEmLista.get(valoresEmLista.size() / 2);
        }

        return 0;
    }

}
