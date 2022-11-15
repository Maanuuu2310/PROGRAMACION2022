import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("hola selecciona una opación");
        System.out.println("1: Ir a la convivencia");
        System.out.println("2: no ir a la convivencia");
        System.out.println("3: papusalida");

        op = keyboard.nextInt();

        switch(op) {
            case 1:
                System.out.println("uwu");
                break;
            case 2:
                System.out.println("uwunt");
                break;
            case 3:
                System.out.println("adios papu");
                break;
            default:
                System.out.println("rage");
                break;
        }


    }
}
