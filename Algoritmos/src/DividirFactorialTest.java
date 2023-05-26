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

    @Test
    void testDivisioPrueba3() {
        DividirFactorial d = new DividirFactorial();
        double resultadoActual = d.divisio(0, 7);
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba4() {
        DividirFactorial d = new DividirFactorial();
        double resultadoActual = d.divisio(10, 10);
        double resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}