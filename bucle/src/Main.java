import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean parar = false;
        Scanner keyboard = new Scanner(System.in);
        int value = 0;

        for (int i = 0; i < 1000 && parar == false; i++) {
            System.out.println("uwu");
            System.out.println("Quieres parar");
            value = keyboard.nextInt();
            if (value == 1) {
                parar = true;
            }
        }
    }
}
