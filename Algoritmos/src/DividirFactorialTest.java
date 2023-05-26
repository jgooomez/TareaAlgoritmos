import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    DividirFactorial d = new DividirFactorial();

    @Test
    void testDivisioPrueba1() {
        double resultadoActual = d.divisio(4, 3);
        double resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba2() {
        DividirFactorial d = new DividirFactorial();
        double resultadoActual = d.divisio(5, 2);
        double resultadoEsperado = 60;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}