public class Main {

    public static void main(String[] args) {
        final int NUMEROS[] = {0, 1 , 2 ,3 ,4 ,5 ,6 ,7, 8, 9, 10};

        int pares[] = new int[6];
        int nextPar = 0;

        int impares[] = new int[4];


        for (int i = 0; i < NUMEROS.length; i++) {
            if (NUMEROS[i] %2 == 0) {
                pares[nextPar] = NUMEROS[i];
                nextPar++;
            } else {

            }
        }
        System.out.print("el array de pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + ", ");

        }
        
    }
}
