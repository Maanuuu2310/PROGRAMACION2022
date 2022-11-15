import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valorA = 0;
        int valorB = 0;
        Scanner teclado = new Scanner(System.in);

        while (valorA !=-1 && valorB !=-1) {
            System.out.println("buenos dias introduce un valor");
            valorA = teclado.nextInt();

            System.out.println("Introduce otro valor");
            valorB = teclado.nextInt();

            if (valorA * valorB > 10000) {
                System.out.println("la resultado de la multipicación es " + valorA * valorB);
            }
        }
    }
}
