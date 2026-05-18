import java.util.Scanner;

/**
 * The type Numeros primos.
 */
public class numerosPrimos {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int ndias = pedirNumeroDias();
        int años = calcularAnios(ndias);
        int meses = calcularMeses(ndias);
        int dias = calcularDias(ndias);

        mostrarResultado(ndias, años, meses, dias);
    }


    /**
     * Pedir numero dias int.
     *
     * @return the int
     */
    public static int pedirNumeroDias() {
        Scanner t = new Scanner(System.in);
        int ndias;
        do {
            System.out.println("Introduce el número de días a convertir (valores mayores de 0)");
            ndias = t.nextInt();
        } while (ndias <= 0);
        t.close();
        return ndias;
    }

    /**
     * Calcular anios int.
     *
     * @param ndias the ndias
     * @return the int
     */
    public static int calcularAnios(int ndias) {
        return ndias / 365;
    }

    /**
     * Calcular meses int.
     *
     * @param ndias the ndias
     * @return the int
     */
    public static int calcularMeses(int ndias) {
        return (ndias % 365) / 30;
    }

    /**
     * Calcular dias int.
     *
     * @param ndias the ndias
     * @return the int
     */
    public static int calcularDias(int ndias) {
        return (ndias % 365) % 30;
    }

    /**
     * Mostrar resultado.
     *
     * @param ndias the ndias
     * @param años  the años
     * @param meses the meses
     * @param dias  the dias
     */
    public static void mostrarResultado(int ndias, int años, int meses, int dias) {
        System.out.println("El " + ndias + " corresponde a "
                + años + " año(s), "
                + meses + " mes(es), "
                + dias + " día(s).");
        System.out.println("Gracias por utilizar mi programa");
    }
}
