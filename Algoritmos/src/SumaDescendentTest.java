import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumaDescendentTest {

    SumaDescendent s = new SumaDescendent();

    @Test
    void testSuma4578() {
        int resultadoActual = s.suma(4578);
        int resultadoEsperado = 5242;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testSuma12() {
        int resultadoActual = s.suma(12);
        int resultadoEsperado = 14;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testSuma222() {
        int resultadoActual = s.suma(222);
        int resultadoEsperado = 246;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}