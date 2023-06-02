import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolidivisiblesTest {

    @Test
    void testEsDivisible381654729() {
        boolean esperado = true;
        boolean actual = Polidivisibles.esDivisible(381654729);
        assertEquals(esperado, actual);
    }
    @Test
    void testEsDivisible102() {
        boolean esperado = true;
        boolean actual = Polidivisibles.esDivisible(102);
        assertEquals(esperado, actual);
    }

    @Test
    void testEsDivisible9876() {
        boolean esperado = true;
        boolean actual = Polidivisibles.esDivisible(9876);
        assertEquals(esperado, actual);
    }


}