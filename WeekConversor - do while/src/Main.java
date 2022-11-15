import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int IMITIAL_VALUE = -1;
        final int QUIT_VALUE = 0;
        final int DAYLENGTH = 7;

        final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;
        final int SUNDAY = 7;
        int option = IMITIAL_VALUE;

        String []dayName = new String[DAYLENGTH];

        dayName[MONDAY] = "Lunes";
        dayName[TUESDAY] = "Martes";
        dayName[WEDNESDAY] = "Miercoles";
        dayName[THURSDAY] = "Jueves";
        dayName[FRIDAY] = "Viernes";

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1-7 para elegir el dia de la semana");
            System.out.println("0 para salir");
            option = teclado.nextInt();


        } while (option != QUIT_VALUE);
    }
}


/*
switch(option){
         case MONDAY:
         System.out.println("El dia es Lunes");
         System.out.println("");
         break;
         case TUESDAY:
         System.out.println("El dia es Martes");
         System.out.println("");
         break;
         case WEDNESDAY:
         System.out.println("El dia es Miercoles");
         System.out.println("");
         break;
         case THURSDAY:
         System.out.println("El dia es Jueves");
         System.out.println("");
         break;
         case FRIDAY:
         System.out.println("El dia es Viernes");
         System.out.println("");
         break;
         case SATURDAY:
         System.out.println("El dia es Sabado");
         System.out.println("");
         break;
         case SUNDAY:
         System.out.println("El dia es Domingo");
         System.out.println("");
         break;
         case QUIT_VALUE:
         System.out.println("Saliendo...");
         System.out.println("");
         break;
default:
        System.out.println("Ese numero no esta en la lista");
        breaK;
*/