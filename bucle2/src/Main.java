import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String frase;
        int i = 0;
        boolean parar = false;

        System.out.println("Que frase quieres que repita");
        frase = keyboard.nextLine();

        while (i < 1000 && parar == false) {
            System.out.println((i + 1) + " " + frase);
            i ++;

            System.out.println("pulse 1 para salir ");
            i = keyboard.nextInt();

            if (i == 1) {
                parar = true;
            }
        }

    }
}
