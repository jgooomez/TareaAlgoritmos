import java.util.ArrayList;

public class Cablejat {
    public boolean esPotConectar(ArrayList<String> vector) {
        int contHembras = 0;
        int contMachos = 0;
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.get(i).length(); j++) {
                String digito = String.valueOf(vector.get(i).charAt(j));
                if (digito.equalsIgnoreCase("M")) {
                    contMachos++;
                } else if (digito.equalsIgnoreCase("F")) {
                    contHembras++;
                }
            }
        }

        if (contMachos == contHembras) {
            return true;
        } else {
            return false;
        }
    }
}
