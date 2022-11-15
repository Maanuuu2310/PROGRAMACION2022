public class Main {

    public static void main(String[] args) {
        String tab = "";
        final String WEEKDAY[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "sabado", "domingo"};

        for (int i = 0; i < WEEKDAY.length; i++) {
            System.out.println(tab + WEEKDAY[i]);
            tab+= "\t";
        }
    }
}
