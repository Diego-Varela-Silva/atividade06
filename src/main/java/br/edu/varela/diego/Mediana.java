package br.edu.varela.diego;


import java.util.Arrays;
import java.util.List;

class Mediana {

    double calcular(Double[] valores) {
        if (valores == null) throw new VazioOuNuloException();
        if (valores.length == 0) throw new VazioOuNuloException();

        List<Double> valoresEmLista = Arrays.asList(valores);

        valoresEmLista.sort((n1, n2) -> {
            if (n1 < n2) return -1;
            if (n1 > n2) return 1;
            return 0;
        });

        if (valoresEmLista.size() % 2 != 0) {
            return valoresEmLista.get(valoresEmLista.size() / 2);
        } else {
            Double valor1 = valoresEmLista.get((valoresEmLista.size() / 2) - 1);
            Double valor2 = valoresEmLista.get(valoresEmLista.size() / 2);
            return (valor1 + valor2) / 2;
        }

    }

    double calcularMedia(Double[] valores) {
        if (valores == null) throw new VazioOuNuloException();
        if (valores.length == 0) throw new VazioOuNuloException();

        double soma = Arrays.stream(valores)
                .reduce((n1, n2) -> n1 + n2)
                .orElse(0D);

        return soma / valores.length;
    }
}
