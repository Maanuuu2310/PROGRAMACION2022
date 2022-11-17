import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static float op1, op2;


    private static float recogerDatosOp1() {
        System.out.println("Introduce un valor");
        op1 = teclado.nextFloat();
        return op1;
    }

    private static float recogerDatosOp2() {
        System.out.println("Introduce un valor");
        op2 = teclado.nextFloat();
        return op2;
    }

    public static void main(String[] args) {
        int option;
        boolean parar = false;
        float op1, op2;
        Calculadora newCalculadora = new Calculadora();
        Scanner keyboard = new Scanner(System.in);

        while (!parar) {
            System.out.println("----PapuCalculadora----");
            System.out.println("Seleccione una opcion");
            System.out.println("1º Sumar");
            System.out.println("2º Restar");
            System.out.println("3º Multiplicar");
            System.out.println("4º Dividir");
            System.out.println("Pulse 5 para Salir");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    newCalculadora.sumar(recogerDatosOp1(), recogerDatosOp2());
                    System.out.println("El resultado de la suma es: " + newCalculadora.getResultado());
                    System.out.println("\n");
                    break;
                case 2:

                    op1 = recogerDatosOp1();
                    op2 = recogerDatosOp2();
                    newCalculadora.restar(op1, op2);
                    System.out.println("El resultado de la resta es: " + newCalculadora.getResultado());
                    System.out.println("\n");
                    break;
                case 3:
                    newCalculadora.multiplicar(recogerDatosOp1(), recogerDatosOp2());
                    System.out.println("El resultado de la multiplicación es: " + newCalculadora.getResultado());
                    System.out.println("\n");
                    break;
                case 4:
                    newCalculadora.dividir(recogerDatosOp1(), recogerDatosOp2());
                    System.out.println("El resultado de la división es: " + newCalculadora.getResultado());
                    break;
                case 5:
                    parar = true;
                    System.out.println("Cerrando la PapuCalculadora");
                    break;
                default:
                    System.out.println("Elige bien la opción papu");
            }
        }

    }
}
