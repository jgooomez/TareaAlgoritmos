import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {

    Cablejat c = new Cablejat();

    @Test
    void testEsPotConectarDosMachos() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("MM");
        cables.add("MF");
        cables.add("FM");
        cables.add("FF");

        boolean actual = c.esPotConectar(cables);
        boolean esperado = true;

        assertEquals(esperado,actual);
    }

    @Test
    void testEsPotConectarDosHembras() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MF");

        boolean actual = c.esPotConectar(cables);
        boolean esperado = false;

        assertEquals(esperado,actual);
    }

    @Test
    void testEsPotConectarVariados() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MF");
        cables.add("MM");
        cables.add("MF");
        cables.add("FM");
        cables.add("FF");

        boolean actual = c.esPotConectar(cables);
        boolean esperado = false;

        assertEquals(esperado,actual);
    }
}