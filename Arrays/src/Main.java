import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nota; /* definimos una variable llamada nota */
        final int APROBADO = 5; /* definimos una constante llamada APROBADO */

        System.out.println("Introduzca su ultima nota: ");
        Scanner keyboard = new Scanner(System.in);
        nota = keyboard.nextInt(); /* con esto leemos la nota introducida por el usuario */

        if (nota >= APROBADO){ /* si la nota es mayor que la que establecimos en la constante aprobado */
            /* dira si estamos aprobados y si no dira suspendido*/
            System.out.println("Aprobado");
        }else {
            System.out.println("estas suspendido papu :v");
        }
    }
}
