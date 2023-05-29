public class SumaDescendent {
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
