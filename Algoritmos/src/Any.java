/**
 * Esta clase implementa un método para contar los digitos diferentes de un anyo.
 * @author Javi Gómez.
 * @version 1.1 26/05/2023.
 */
public class Any {
    /**
     * Este método cuenta la cantidad de dígitos diferentes en un número.
     * @param numero El número del cual se contarán los dígitos diferentes.
     * @return La cantidad de dígitos diferentes en el número.
     */
    public int digitsDiferents(long numero) {
        int contDigitsDiferents = 1;
        String numeroComprobar = String.valueOf(numero);

        for (int i = 1; i < numeroComprobar.length(); i++) {
            int digitoActual = Integer.parseInt(String.valueOf(numeroComprobar.charAt(i)));
            int digitoAnterior = Integer.parseInt(String.valueOf(numeroComprobar.charAt(i - 1)));

            if (digitoActual != digitoAnterior) {
                contDigitsDiferents++;
            }
        }

        if (contDigitsDiferents == 1) {
            contDigitsDiferents = 0;
        }

        return contDigitsDiferents;
    }
}
