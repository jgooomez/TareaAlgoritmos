import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnyTest {
    Any anyoPrueba = new Any();

    @Test
    void testDigitsDiferentsTodosDiferentes() {
        int resultadoActual = anyoPrueba.digitsDiferents(2345);
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDigitsDiferentsTodosIguales() {
        int resultadoActual = anyoPrueba.digitsDiferents(2222);
        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDigitsDiferentsMezclados() {
        int resultadoActual = anyoPrueba.digitsDiferents(2004);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDigitsDiferentsMuchos() {
        int resultadoActual = anyoPrueba.digitsDiferents(123456789);
        int resultadoEsperado = 9;
        assertEquals(resultadoEsperado, resultadoActual);
    }

}