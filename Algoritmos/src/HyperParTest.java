import static org.junit.jupiter.api.Assertions.*;

class HyperParTest {
    HyperPar p = new HyperPar();

    @org.junit.jupiter.api.Test
    void testisHyperPar2222() {
        boolean resultadoActual = p.isHyperPar(2222);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @org.junit.jupiter.api.Test
    void testisHyperPar1234() {
        boolean resultadoActual = p.isHyperPar(1234);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @org.junit.jupiter.api.Test
    void testisHyperPar12345564267462() {
        boolean resultadoActual = p.isHyperPar(1234556462);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @org.junit.jupiter.api.Test
    void testisHyperPar468686824() {
        boolean resultadoActual = p.isHyperPar(468686824);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }

}