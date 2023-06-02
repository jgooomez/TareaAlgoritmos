/**
 * Esta clase implementa un método para calcular la suma de los subnúmeros descendentes de un número dado.
 */
public class SumaDescendent {
    /**
     * Calcula la suma de los subnúmeros descendentes de un número.
     * @param numero El número del cual se calculará la suma de los subnúmeros descendentes.
     * @return La suma de los subnúmeros descendentes.
     */
    public int suma(long numero) {
        String numeroString = String.valueOf(numero);
        int longitud = String.valueOf(numero).length();
        int suma = 0;

        for (int i = 0; i < longitud; i++) {
            String subNumeroString = numeroString.substring(i);
            int subNumero = Integer.parseInt(subNumeroString);
            suma += subNumero;
        }

        return suma;
    }
}
