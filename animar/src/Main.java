import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String frase;
        boolean parar = false;
        int value = 0;

        System.out.println("Que frase quieres que repita");
        frase = keyboard.nextLine();

        for (int i = 0; i <10000 && parar == false; i++) {
            System.out.println((i + 1) + " " + frase);

            System.out.println("¿quieres parar? pulsa 1 para salir");
            value = keyboard.nextInt();

            if (value == 1) {
                parar = true;
            }
            System.out.println("Finalizado tenga buen dia");

        }

    }
}
