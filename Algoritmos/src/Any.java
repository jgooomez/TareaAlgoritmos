public class Any {
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
