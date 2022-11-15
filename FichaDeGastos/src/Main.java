import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreCompleto;
        Scanner teclado = new Scanner(System.in);



        System.out.print("Por favor introduce tu nombre completo: ");
        nombreCompleto = teclado.next().toUpperCase();

        System.out.print("hola "+ nombreCompleto + " Introduce la cantidad de tickets que tengas: ");
        final int NUMEROTICKETS = teclado.nextInt();

        System.out.println("\n");

        double lista[] = new double[NUMEROTICKETS];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduce el importe de los tickets " + (i + 1) + " : ");
            lista[i] = teclado.nextDouble();
        }

        System.out.println("\n");

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Hola " + nombreCompleto + " el importe de su ticket " + (i +1 ) + " : " + lista[i]);

        }



    }
}
