public class Polidivisibles {
    /**
     * Verifica si un número es polidivisible.
     * @param numero El número a verificar.
     * @return true si el número es polidivisible, false en caso contrario.
     */
    public static boolean esDivisible(long numero) {
        int longitud = String.valueOf(numero).length();
        int cont = longitud;
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
