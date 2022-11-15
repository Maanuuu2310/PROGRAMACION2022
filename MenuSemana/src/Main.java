import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        while (!salir){
            System.out.println("---Menu Semana---");
            System.out.println("Seleccione una opcion");
            System.out.println("1: Lunes");
            System.out.println("2: Martes");
            System.out.println("3: Miercoles");
            System.out.println("4: Jueves");
            System.out.println("5: Viernes");
            System.out.println("6: Sabado");
            System.out.println("7: Domingo");
            System.out.println("0: Salir");

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
                    salir = true;
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
