/**
 * Esta clase implementa un método para comprobar si un numero es HyperPar.
 * @author Javi Gómez.
 * @version 1.1 22/05/2023.
 */
public class HyperPar {
    /**
     * Método isHyperPar para comprobar si el parámetro introducido es un HyperPar.
     * @param numeroComprobar El parámetro es un long que le pasaremos para comprobar si es HyperPar.
     * @return true si es HyperPar y false si no es HyperPar.
     */
    public boolean isHyperPar(long numeroComprobar) {
        //Campo de la clase
        boolean isHyperPar = true;
        //Campo de la clase
        String numero = String.valueOf(numeroComprobar);
        //Campo de la clase
        boolean cifraEsPar;

        for (int i = 0; i < numero.length() ; i++) {
            cifraEsPar = (Integer.parseInt(String.valueOf(numero.charAt(i))) % 2 == 0);
            if (!cifraEsPar) {
                isHyperPar = false;
                return isHyperPar;
            }
        }

        return isHyperPar;
    }
}
