/**
 * Esta clase implementa un método para dividir los factoriales de dos numeros.
 * @author Javi Gómez.
 * @version 1.1 26/05/2023.
 */
public class DividirFactorial {
    /**
     * Este método divide el factorial del numerador entre el factorial del denominador.
     * @param nominador El numerador.
     * @param denominador El denominador.
     * @return El resultado de la división de los factoriales.
     */
    public double divisio(double nominador, double denominador) {
        double factorialNominador = 1;
        double factorialDenominador = 1;

        if (denominador == 0 || nominador == 0) {
            return 0;
        } else {
            for (int i = 1; i <= nominador; i++) {
                factorialNominador *= i;
            }

            for (int j = 1; j <= denominador; j++) {
                factorialDenominador *= j;
            }
        }


        double resultado = factorialNominador / factorialDenominador;
        return resultado;
    }
}
