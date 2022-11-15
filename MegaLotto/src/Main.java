import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int valorA = 0;
        int valorB = 0;
        int valorC = 0;
        int randomNumber;

        System.out.print("por favor introduce tu primer numero: ");
        valorA = keyboard.nextInt();

        System.out.print("por favor introduce tu segundo numero: ");
        valorB = keyboard.nextInt();

        System.out.print("por favor introduce tu tercer numero: ");
        valorC = keyboard.nextInt();

        System.out.println("Sus numeros son: " +  "  " + valorA + "  " + valorB + "  " + valorC + "\n");


        randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("el numero ganador es: " + randomNumber);

        if (randomNumber == valorA || randomNumber == valorB || randomNumber == valorC) {
            System.out.println("Premio");
        }else {
            System.out.println("Sigue jugando hay miles de premios");
        }
    }
}
