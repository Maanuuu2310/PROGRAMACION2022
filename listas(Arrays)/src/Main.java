public class Main {

    public static void main(String[] args) {
        int lista[] = new int[6]; /* definimos una lista */
        final int tamanoFinal = 4; /* definimos una constante */
        final int DEFAULT_VALUE = -1; /* definimos una constante -1 */

        /* para guardar algo en la lista usamos el nombre
        que definimos antes, luego la posicion donde queremos
        guardarlo y le añadimos el valor que guardara
        en dicha posicion
         */
        lista[0] = 8;
        lista[2] = 3;
        lista[1] = 9;

        ;

        /* aca definimos la segunda lista con el tamaño de la constante */
        int miSegundaLista[] = new int [tamanoFinal];
        miSegundaLista[2] = DEFAULT_VALUE; /* esto lo que hara es guardar -1 en la posicion 2 de la lista */

        // System.out.println("Segunda posicion: " + miSegundaLista[2]);
        //miSegundaLista[4] = 9; // tener cuidado con los limites del array //

        for (int i = 0; i < miSegundaLista.length; i++) { // con esto recorremos todos las posiciones de un array //
            System.out.println(" en la posicion " + i + " hay un " + miSegundaLista[i]);
        }

    }
}
