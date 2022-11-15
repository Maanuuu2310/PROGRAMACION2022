public class Main {

    public static void main(String[] args) {
        // Inicializando una cadena de texto
        String text = "Hola mundo";
        String vocals = "aeiou";

        // Inicializando de una cadena utlizando un constructor
        String text2 = new String("adios papu");
        System.out.println("Esto es lo que hay en texto " + text);
        System.out.println("Esto es lo que hay en texto2 " + text2 );

        // para obtener la letra de una posicion utilizo charAt
        System.out.println("la vocal en la tercera posicion es " + vocals.charAt(3));

        // para pasar a mayusculas utilizo toUpperCase
        System.out.println("estas son las vocales en mayusculas " + vocals.toUpperCase());
        System.out.println("Quiero saber si siguen en mayusculas " + vocals);

        // para pasar a mayusculas utilizo toUpperCase 100%
        String vocalsMayus = vocals.toUpperCase();
        System.out.println("Otra variable con todo a mayuscula " + vocalsMayus);
        System.out.println("quiero saber si siguen en mayusculas " + vocalsMayus);

        // para pasar a minusculas utilizo toLowerCase
        System.out.println("pasando a minusculas " + vocalsMayus.toLowerCase());

        // para buscar una letra u espacio en una cadena de caracteres
        String facts = "El único superhéroe creible es batman";
        System.out.println("la primera \"u\" esta en la posicion " + facts.indexOf("u"));
        System.out.println("el primer espacio esta en la posicion " + facts.indexOf(" "));
        System.out.println("la primera \"w\" esta en la posicion " + facts.indexOf("w"));
        System.out.println("la ultima \"a\" está en " + facts.lastIndexOf("a"));

        // para saber como termina e inicia una cadena de caracteres
        String quijote = "En un lugar de la Mancha cuyo nombre...";
        System.out.println("¿Empieza como el Quijote? " + quijote.startsWith("En un lugar"));
        System.out.println("¿Termina con puntos suspensivos? " + quijote.endsWith("..."));

        if (quijote.startsWith("En un lugar")) {
            System.out.println("Hemos encontrado el quijote");
        }else {
            System.out.println("no hemos encontrado el quijote");
        }

        // para cortar una cadena de texo (si queremos que salga la palabra completa seria 23 + 1)
        System.out.println("la cadena cortada " +  quijote.substring(15 , 23 + 1));

        // para saber un caracter exacto en una cadena
        System.out.println("el primer caracter de \"la Mancha\" está en " + quijote.indexOf("la Mancha"));

        // para saber la posicion exacta de una letra en una cadena
        System.out.println("Posicion del último \"d\" " + quijote.lastIndexOf("de"));


    }
}
