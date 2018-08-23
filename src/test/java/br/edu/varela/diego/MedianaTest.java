package br.edu.varela.diego;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MedianaTest {

    @Test(expected = VazioOuNuloException.class)
    public void testaEntradaNulaDeveRetornarExcessao() {
        Mediana mediana = new Mediana();
        mediana.calcular(null);
    }

    public void testaEntradaComIndiceImpar() {
        Mediana mediana = new Mediana();
        double [] entrada = new double[]{ 2, 1, 3 };
        assertEquals(2, mediana.calcular(entrada), 1.0);
    }

}
