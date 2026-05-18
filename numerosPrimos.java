import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int ndias, año, mes, dias;
        do {
            System.out.println("Introduce el número de días a convertir (valores mayores de 0)");
            ndias = t.nextInt();
        } while (ndias <= 0);
        año = (int) ndias / 365;
        mes = (int) (ndias % 365) / 30;
        dias = (ndias % 365) % 30;
        System.out.println("El " + ndias + " corresponde a " + año + " año " + mes + " mes " + dias + " dias.");
        System.out.println("Gracias por utilizar mi programa");
        t.close();
    }
}