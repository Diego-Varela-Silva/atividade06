package br.edu.varela.diego;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MedianaTest {

    @Test(expected = VazioOuNuloException.class)
    public void testaEntradaNulaDeveRetornarExcessao() {
        Mediana mediana = new Mediana();
        mediana.calcular(null);
    }

    @Test(expected = VazioOuNuloException.class)
    public void testaEntradaVaziaDeveRetornarExcessao() {
        Mediana mediana = new Mediana();
        mediana.calcular(new Double[0]);
    }

    @Test
    public void testaEntradaComIndiceImpar() {
        Mediana mediana = new Mediana();
        Double[] entrada = new Double[]{ 2D, 1D, 3D };
        assertEquals(2, mediana.calcular(entrada), 0.1);
    }

}
