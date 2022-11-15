import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = -1;
        Scanner teclado = new Scanner(System.in);

        while (option != 0){
            System.out.println("1-7 para elegir el dia de la semana");
            System.out.println("0 para salir");
            option = teclado.nextInt();

            switch(option){
                case 1:
                    System.out.println("El dia es Lunes");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("El dia es Martes");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("El dia es Miercoles");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("El dia es Jueves");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("El dia es Viernes");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("El dia es Sabado");
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("El dia es Domingo");
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ese numero no esta en la lista");
                    break;
            }
        }
    }
}
