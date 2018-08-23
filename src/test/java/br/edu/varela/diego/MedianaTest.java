package br.edu.varela.diego;

import org.junit.Test;

public class MedianaTest {

    @Test(expected = Exception.class)
    public void testaEntradaNulaDeveRetornarExcessao() {
        Mediana mediana = new Mediana();
        mediana.calcular(null);
    }

}
