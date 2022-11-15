import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int factorial;
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Buenos dias introduce un numero del 1 al 12");
        numero = teclado.nextInt();

        factorial = 1;

        for (int i=numero; i > 0 ; i--) {
            factorial *=i;
        }
        System.out.println("el resultado de " + "n!" + " es: " + factorial);
    }


}

