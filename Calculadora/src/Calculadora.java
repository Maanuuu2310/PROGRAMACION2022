public class Calculadora {
    private float resultado;

    public float getResultado() {
        return resultado;
    }

    public void sumar(float op1, float op2) {
        resultado = op1 + op2;
    }

    public void restar(float op1, float op2) {
        resultado = op1 - op2;
    }

    public void multiplicar(float op1, float op2) {
        resultado = op1 * op2;
    }

    public void dividir(float op1, float op2) {
        if (op2 == 0) {
            System.out.println("no podemos dividir entre 0");
        } else {
            resultado = op1 / op2;
        }
    }

    public void mostrarResultado() {
        System.out.println(resultado);
    }
}
