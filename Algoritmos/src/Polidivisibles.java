public class Polidivisibles {
    public static boolean esDivisible(long numero) {
        int longitud = String.valueOf(numero).length();
        int cont = 9;
        boolean isValid = false;

        for (int i = 0; i < longitud; i++) {
            if (numero % cont == 0) {
                isValid = true;
            } else {
                isValid = false;
            }
            cont--;
        }

        return isValid;
    }
}
