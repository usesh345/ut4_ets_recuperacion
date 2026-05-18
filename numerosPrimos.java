import java.util.Scanner;

public class numerosPrimos {

    public static void main(String[] args) {
        int ndias = pedirNumeroDias();
        int años = calcularAnios(ndias);
        int meses = calcularMeses(ndias);
        int dias = calcularDias(ndias);

        mostrarResultado(ndias, años, meses, dias);
    }


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

    public static int calcularAnios(int ndias) {
        return ndias / 365;
    }

    public static int calcularMeses(int ndias) {
        return (ndias % 365) / 30;
    }

    public static int calcularDias(int ndias) {
        return (ndias % 365) % 30;
    }
    
    public static void mostrarResultado(int ndias, int años, int meses, int dias) {
        System.out.println("El " + ndias + " corresponde a "
                + años + " año(s), "
                + meses + " mes(es), "
                + dias + " día(s).");
        System.out.println("Gracias por utilizar mi programa");
    }
}
