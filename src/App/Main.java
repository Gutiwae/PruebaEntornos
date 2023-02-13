package App;

public class Main {
    /**
     *Metodo constructor parametrizado
     * @param num1 primer numero introducido
     * @param num2 segundo numero introducido
     */
    public int suma(int num1, int num2) {
        /**
         * Metodo para regresar el resultado de la suma
         * @return Regresa la suma entre los parametros num1 y num2
         */
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        /**
         * Metodo para regresar el resultado de la resta
         * @return Regresa la resta entre los parametros num1 y num2
         */
        return num1 - num2;
    }

    public int multiplica(int num1, int num2) {
        /**
         * Metodo para regresar el resultado de la multiplicacion
         * @return Regresa la multiplicacion entre los parametros num1 y num2
         */
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        /**
         * Metodo que establece un error si se intenta dividir por cero
         */
        if (num2 == 0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        /**
         * Metodo para regresar el resultado de la division
         * @return Regresa la division entre los parametros num1 y num2
         */
        return num1 / num2;
    }

    private int valor1;
    private int valor2;
}

